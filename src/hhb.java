import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hhb implements hhk {
   public static final MapCodec<hhb> a = hhc.a.xmap(hhb::new, $$0 -> $$0.b);
   private final hhc b;

   public hhb(boolean $$0, hhc.a $$1) {
      this(new hhc($$0, $$1));
   }

   private hhb(hhc $$0) {
      this.b = $$0;
   }

   @Override
   public float a(czk $$0, @Nullable gkl $$1, @Nullable bxj $$2, int $$3) {
      return this.b.a($$0, $$1, $$2, $$3);
   }

   @Override
   public MapCodec<hhb> a() {
      return a;
   }
}
