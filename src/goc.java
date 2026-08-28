import javax.annotation.Nullable;

public interface goc extends gof {
   @Deprecated
   @Override
   default float call(cun $$0, @Nullable fxt $$1, @Nullable btn $$2, int $$3) {
      return ayx.a(this.unclampedCall($$0, $$1, $$2, $$3), 0.0F, 1.0F);
   }

   float unclampedCall(cun var1, @Nullable fxt var2, @Nullable btn var3, int var4);
}
