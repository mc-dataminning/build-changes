import javax.annotation.Nullable;

public interface fzf extends fzi {
   @Deprecated
   @Override
   default float call(ckj $$0, @Nullable fjr $$1, @Nullable bkj $$2, int $$3) {
      return asy.a(this.unclampedCall($$0, $$1, $$2, $$3), 0.0F, 1.0F);
   }

   float unclampedCall(ckj var1, @Nullable fjr var2, @Nullable bkj var3, int var4);
}
