import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public class ka implements ju {
   public static final Codec<ka> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dmb.b.fieldOf("destination").forGetter($$0x -> $$0x.c), Codec.INT.fieldOf("arrival_in_ticks").forGetter($$0x -> $$0x.d))
            .apply($$0, ka::new)
   );
   public static final ju.a<ka> b = new ju.a<ka>() {
      public ka a(jv<ka> $$0, StringReader $$1) throws CommandSyntaxException {
         $$1.expect(' ');
         float $$2 = (float)$$1.readDouble();
         $$1.expect(' ');
         float $$3 = (float)$$1.readDouble();
         $$1.expect(' ');
         float $$4 = (float)$$1.readDouble();
         $$1.expect(' ');
         int $$5 = $$1.readInt();
         hx $$6 = hx.a((double)$$2, (double)$$3, (double)$$4);
         return new ka(new dlt($$6), $$5);
      }

      public ka a(jv<ka> $$0, ty $$1) {
         dmb $$2 = dmc.c($$1);
         int $$3 = $$1.n();
         return new ka($$2, $$3);
      }
   };
   private final dmb c;
   private final int d;

   public ka(dmb $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(ty $$0) {
      dmc.a(this.c, $$0);
      $$0.c(this.d);
   }

   @Override
   public String a() {
      ejz $$0 = this.c.a(null).get();
      double $$1 = $$0.a();
      double $$2 = $$0.b();
      double $$3 = $$0.c();
      return String.format(Locale.ROOT, "%s %.2f %.2f %.2f %d", kc.k.b(this.b()), $$1, $$2, $$3, this.d);
   }

   @Override
   public jv<ka> b() {
      return jw.P;
   }

   public dmb c() {
      return this.c;
   }

   public int d() {
      return this.d;
   }
}
