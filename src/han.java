import javax.annotation.Nullable;

public interface han extends haq {
   @Deprecated
   @Override
   default float call(cxo $$0, @Nullable gfj $$1, @Nullable bwf $$2, int $$3) {
      return bae.a(this.unclampedCall($$0, $$1, $$2, $$3), 0.0F, 1.0F);
   }

   float unclampedCall(cxo var1, @Nullable gfj var2, @Nullable bwf var3, int var4);
}
