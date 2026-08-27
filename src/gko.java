import javax.annotation.Nullable;

public interface gko extends gkr {
   @Deprecated
   @Override
   default float call(crj $$0, @Nullable fuh $$1, @Nullable bqo $$2, int $$3) {
      return axk.a(this.unclampedCall($$0, $$1, $$2, $$3), 0.0F, 1.0F);
   }

   float unclampedCall(crj var1, @Nullable fuh var2, @Nullable bqo var3, int var4);
}
