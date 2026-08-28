import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hdg implements hdk {
   private final gof a;
   private final hgs b;

   public hdg(gof $$0, hgs $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(cwn $$0, ffu $$1, glx $$2, int $$3, int $$4, boolean $$5) {
      this.a.a($$1, $$2, $$3, $$4, this.b);
   }

   public static record a(aku b) implements hdo.a {
      public static final MapCodec<hdg.a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(aku.a.fieldOf("texture").forGetter(hdg.a::b)).apply($$0, hdg.a::new));

      public a(cvm $$0) {
         this(gms.b($$0));
      }

      @Override
      public MapCodec<hdg.a> a() {
         return a;
      }

      @Override
      public hdo<?> a(gey $$0) {
         return new hdg(new gof($$0), gms.a(this.b));
      }
   }
}
