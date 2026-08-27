import javax.annotation.Nullable;

public interface gbe extends gbh {
   @Deprecated
   @Override
   default float call(clo $$0, @Nullable flo $$1, @Nullable bll $$2, int $$3) {
      return atq.a(this.unclampedCall($$0, $$1, $$2, $$3), 0.0F, 1.0F);
   }

   float unclampedCall(clo var1, @Nullable flo var2, @Nullable bll var3, int var4);
}
