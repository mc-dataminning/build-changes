import javax.annotation.Nullable;

public interface gie extends gih {
   @Deprecated
   @Override
   default float call(cqk $$0, @Nullable fry $$1, @Nullable bpo $$2, int $$3) {
      return aww.a(this.unclampedCall($$0, $$1, $$2, $$3), 0.0F, 1.0F);
   }

   float unclampedCall(cqk var1, @Nullable fry var2, @Nullable bpo var3, int var4);
}
