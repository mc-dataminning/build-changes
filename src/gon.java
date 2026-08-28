import javax.annotation.Nullable;

public interface gon extends goq {
   @Deprecated
   @Override
   default float call(cua $$0, @Nullable fyd $$1, @Nullable bsy $$2, int $$3) {
      return aye.a(this.unclampedCall($$0, $$1, $$2, $$3), 0.0F, 1.0F);
   }

   float unclampedCall(cua var1, @Nullable fyd var2, @Nullable bsy var3, int var4);
}
