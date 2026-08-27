import javax.annotation.Nullable;

public interface fyj extends fym {
   @Deprecated
   @Override
   default float call(cjf $$0, @Nullable fix $$1, @Nullable bjg $$2, int $$3) {
      return arx.a(this.unclampedCall($$0, $$1, $$2, $$3), 0.0F, 1.0F);
   }

   float unclampedCall(cjf var1, @Nullable fix var2, @Nullable bjg var3, int var4);
}
