import javax.annotation.Nullable;

public interface gam extends gap {
   @Deprecated
   @Override
   default float call(clb $$0, @Nullable fkw $$1, @Nullable bky $$2, int $$3) {
      return ati.a(this.unclampedCall($$0, $$1, $$2, $$3), 0.0F, 1.0F);
   }

   float unclampedCall(clb var1, @Nullable fkw var2, @Nullable bky var3, int var4);
}
