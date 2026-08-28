import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hem implements her {
   private final gpg a;
   private final hhy b;

   public hem(gpg $$0, hhy $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(cxf $$0, fgr $$1, gmx $$2, int $$3, int $$4, boolean $$5) {
      this.a.a($$1, $$2, $$3, $$4, this.b);
   }

   public static record a(aku b) implements hev.a {
      public static final MapCodec<hem.a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(aku.a.fieldOf("texture").forGetter(hem.a::b)).apply($$0, hem.a::new));

      public a(cwe $$0) {
         this(gns.b($$0));
      }

      @Override
      public MapCodec<hem.a> a() {
         return a;
      }

      @Override
      public hev<?> a(gfy $$0) {
         return new hem(new gpg($$0), gns.a(this.b));
      }
   }
}
