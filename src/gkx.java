import javax.annotation.Nullable;

public interface gkx extends gla {
   @Deprecated
   @Override
   default float call(crs $$0, @Nullable fuq $$1, @Nullable bqt $$2, int $$3) {
      return axm.a(this.unclampedCall($$0, $$1, $$2, $$3), 0.0F, 1.0F);
   }

   float unclampedCall(crs var1, @Nullable fuq var2, @Nullable bqt var3, int var4);
}
