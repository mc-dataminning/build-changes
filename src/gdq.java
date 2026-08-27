import javax.annotation.Nullable;

public interface gdq extends gdt {
   @Deprecated
   @Override
   default float call(cmx $$0, @Nullable fnq $$1, @Nullable bmk $$2, int $$3) {
      return aun.a(this.unclampedCall($$0, $$1, $$2, $$3), 0.0F, 1.0F);
   }

   float unclampedCall(cmx var1, @Nullable fnq var2, @Nullable bmk var3, int var4);
}
