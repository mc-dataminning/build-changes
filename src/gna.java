import javax.annotation.Nullable;

public interface gna extends gnd {
   @Deprecated
   @Override
   default float call(ctq $$0, @Nullable fwr $$1, @Nullable bsq $$2, int $$3) {
      return ayf.a(this.unclampedCall($$0, $$1, $$2, $$3), 0.0F, 1.0F);
   }

   float unclampedCall(ctq var1, @Nullable fwr var2, @Nullable bsq var3, int var4);
}
