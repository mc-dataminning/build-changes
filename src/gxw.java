import javax.annotation.Nullable;

public interface gxw extends gxz {
   @Deprecated
   @Override
   default float call(cwf $$0, @Nullable gcy $$1, @Nullable bve $$2, int $$3) {
      return azn.a(this.unclampedCall($$0, $$1, $$2, $$3), 0.0F, 1.0F);
   }

   float unclampedCall(cwf var1, @Nullable gcy var2, @Nullable bve var3, int var4);
}
