import javax.annotation.Nullable;

public interface gna extends gnd {
   @Deprecated
   @Override
   default float call(cto $$0, @Nullable fwr $$1, @Nullable bso $$2, int $$3) {
      return ayd.a(this.unclampedCall($$0, $$1, $$2, $$3), 0.0F, 1.0F);
   }

   float unclampedCall(cto var1, @Nullable fwr var2, @Nullable bso var3, int var4);
}
