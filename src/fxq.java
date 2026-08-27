import javax.annotation.Nullable;

public interface fxq extends fxt {
   @Deprecated
   @Override
   default float call(ciy $$0, @Nullable fii $$1, @Nullable biy $$2, int $$3) {
      return arp.a(this.unclampedCall($$0, $$1, $$2, $$3), 0.0F, 1.0F);
   }

   float unclampedCall(ciy var1, @Nullable fii var2, @Nullable biy var3, int var4);
}
