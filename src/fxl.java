import javax.annotation.Nullable;

public interface fxl extends fxo {
   @Deprecated
   @Override
   default float call(ciw $$0, @Nullable fie $$1, @Nullable biw $$2, int $$3) {
      return aro.a(this.unclampedCall($$0, $$1, $$2, $$3), 0.0F, 1.0F);
   }

   float unclampedCall(ciw var1, @Nullable fie var2, @Nullable biw var3, int var4);
}
