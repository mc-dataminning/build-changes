import javax.annotation.Nullable;

public interface fyf extends fyi {
   @Deprecated
   @Override
   default float call(cjl $$0, @Nullable fis $$1, @Nullable bjm $$2, int $$3) {
      return asb.a(this.unclampedCall($$0, $$1, $$2, $$3), 0.0F, 1.0F);
   }

   float unclampedCall(cjl var1, @Nullable fis var2, @Nullable bjm var3, int var4);
}
