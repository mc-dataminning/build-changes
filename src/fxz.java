import javax.annotation.Nullable;

public interface fxz extends fyc {
   @Deprecated
   @Override
   default float call(cix $$0, @Nullable fin $$1, @Nullable biy $$2, int $$3) {
      return arp.a(this.unclampedCall($$0, $$1, $$2, $$3), 0.0F, 1.0F);
   }

   float unclampedCall(cix var1, @Nullable fin var2, @Nullable biy var3, int var4);
}
