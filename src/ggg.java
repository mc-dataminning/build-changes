import javax.annotation.Nullable;

public interface ggg extends ggj {
   @Deprecated
   @Override
   default float call(cpd $$0, @Nullable fqe $$1, @Nullable boi $$2, int $$3) {
      return awi.a(this.unclampedCall($$0, $$1, $$2, $$3), 0.0F, 1.0F);
   }

   float unclampedCall(cpd var1, @Nullable fqe var2, @Nullable boi var3, int var4);
}
