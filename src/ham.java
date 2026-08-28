import javax.annotation.Nullable;

public interface ham extends hap {
   @Deprecated
   @Override
   default float call(cxo $$0, @Nullable gfi $$1, @Nullable bwf $$2, int $$3) {
      return bae.a(this.unclampedCall($$0, $$1, $$2, $$3), 0.0F, 1.0F);
   }

   float unclampedCall(cxo var1, @Nullable gfi var2, @Nullable bwf var3, int var4);
}
