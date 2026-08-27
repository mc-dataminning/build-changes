import javax.annotation.Nullable;

public interface ghe extends ghh {
   @Deprecated
   @Override
   default float call(cpq $$0, @Nullable fra $$1, @Nullable box $$2, int $$3) {
      return awm.a(this.unclampedCall($$0, $$1, $$2, $$3), 0.0F, 1.0F);
   }

   float unclampedCall(cpq var1, @Nullable fra var2, @Nullable box var3, int var4);
}
