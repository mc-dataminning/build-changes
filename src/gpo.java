import javax.annotation.Nullable;

public interface gpo extends gpr {
   @Deprecated
   @Override
   default float call(cuq $$0, @Nullable fzd $$1, @Nullable btn $$2, int $$3) {
      return ayo.a(this.unclampedCall($$0, $$1, $$2, $$3), 0.0F, 1.0F);
   }

   float unclampedCall(cuq var1, @Nullable fzd var2, @Nullable btn var3, int var4);
}
