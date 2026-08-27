import javax.annotation.Nullable;

public interface gmd extends gmg {
   @Deprecated
   @Override
   default float call(csz $$0, @Nullable fvw $$1, @Nullable bsa $$2, int $$3) {
      return axz.a(this.unclampedCall($$0, $$1, $$2, $$3), 0.0F, 1.0F);
   }

   float unclampedCall(csz var1, @Nullable fvw var2, @Nullable bsa var3, int var4);
}
