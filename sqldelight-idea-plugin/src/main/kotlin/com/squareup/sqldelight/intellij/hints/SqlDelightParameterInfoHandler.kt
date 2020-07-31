package com.squareup.sqldelight.intellij.hints

import com.alecstrong.sql.psi.core.psi.SqlBindExpr
import com.alecstrong.sql.psi.core.psi.SqlTypes
import com.alecstrong.sql.psi.core.psi.SqlValuesExpression
import com.intellij.codeInsight.lookup.LookupElement
import com.intellij.lang.parameterInfo.CreateParameterInfoContext
import com.intellij.lang.parameterInfo.ParameterInfoContext
import com.intellij.lang.parameterInfo.ParameterInfoHandlerWithTabActionSupport
import com.intellij.lang.parameterInfo.ParameterInfoUIContext
import com.intellij.lang.parameterInfo.UpdateParameterInfoContext
import com.intellij.psi.tree.IElementType

class SqlDelightValuesParameterInfoHandler :
    ParameterInfoHandlerWithTabActionSupport<SqlValuesExpression, SqlDelightArgumentsDescription, SqlBindExpr> {

  override fun getActualParameterDelimiterType(): IElementType = SqlTypes.COMMA

  override fun getActualParametersRBraceType(): IElementType = SqlTypes.RP

  override fun findElementForParameterInfo(p0: CreateParameterInfoContext): SqlValuesExpression? {
    TODO("Not yet implemented")
  }

  override fun updateParameterInfo(p0: SqlValuesExpression, p1: UpdateParameterInfoContext) {
    TODO("Not yet implemented")
  }

  override fun updateUI(p0: SqlDelightArgumentsDescription?, p1: ParameterInfoUIContext) {
    TODO("Not yet implemented")
  }

  override fun getArgListStopSearchClasses(): MutableSet<out Class<Any>> {
    TODO("Not yet implemented")
  }

  override fun showParameterInfo(p0: SqlValuesExpression, p1: CreateParameterInfoContext) {
    TODO("Not yet implemented")
  }

//  override fun getActualParameters(expr: SqlValuesExpression): Array<SqlBindExpr> =

  override fun getArgumentListClass(): Class<SqlValuesExpression> {
    TODO("Not yet implemented")
  }

  override fun getArgumentListAllowedParentClasses(): MutableSet<Class<Any>> {
    TODO("Not yet implemented")
  }

  override fun findElementForUpdatingParameterInfo(p0: UpdateParameterInfoContext): SqlValuesExpression? {
    TODO("Not yet implemented")
  }

  //TODO
  override fun couldShowInLookup() = false

  override fun getParametersForLookup(item: LookupElement, context: ParameterInfoContext) = emptyArray<Any>()
}

data class SqlDelightArgumentsDescription(
  val arguments: Array<String>
) {

}