import javax.annotation.Nullable;

public interface gwj extends gwm {
   @Deprecated
   @Override
   default float call(cvs $$0, @Nullable gbm $$1, @Nullable bun $$2, int $$3) {
      return azf.a(this.unclampedCall($$0, $$1, $$2, $$3), 0.0F, 1.0F);
   }

   float unclampedCall(cvs var1, @Nullable gbm var2, @Nullable bun var3, int var4);
}
