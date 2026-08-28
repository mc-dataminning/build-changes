import javax.annotation.Nullable;

public interface gyh extends gyk {
   @Deprecated
   @Override
   default float call(cwm $$0, @Nullable gdh $$1, @Nullable bvh $$2, int $$3) {
      return azm.a(this.unclampedCall($$0, $$1, $$2, $$3), 0.0F, 1.0F);
   }

   float unclampedCall(cwm var1, @Nullable gdh var2, @Nullable bvh var3, int var4);
}
