import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public class kb implements jv {
   public static final Codec<kb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dnu.b.fieldOf("destination").forGetter($$0x -> $$0x.c), Codec.INT.fieldOf("arrival_in_ticks").forGetter($$0x -> $$0x.d))
            .apply($$0, kb::new)
   );
   public static final jv.a<kb> b = new jv.a<kb>() {
      public kb a(jw<kb> $$0, StringReader $$1) throws CommandSyntaxException {
         $$1.expect(' ');
         float $$2 = (float)$$1.readDouble();
         $$1.expect(' ');
         float $$3 = (float)$$1.readDouble();
         $$1.expect(' ');
         float $$4 = (float)$$1.readDouble();
         $$1.expect(' ');
         int $$5 = $$1.readInt();
         hx $$6 = hx.a((double)$$2, (double)$$3, (double)$$4);
         return new kb(new dnm($$6), $$5);
      }

      public kb a(jw<kb> $$0, ui $$1) {
         dnu $$2 = dnv.c($$1);
         int $$3 = $$1.n();
         return new kb($$2, $$3);
      }
   };
   private final dnu c;
   private final int d;

   public kb(dnu $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(ui $$0) {
      dnv.a(this.c, $$0);
      $$0.c(this.d);
   }

   @Override
   public String a() {
      els $$0 = this.c.a(null).get();
      double $$1 = $$0.a();
      double $$2 = $$0.b();
      double $$3 = $$0.c();
      return String.format(Locale.ROOT, "%s %.2f %.2f %.2f %d", kd.j.b(this.b()), $$1, $$2, $$3, this.d);
   }

   @Override
   public jw<kb> b() {
      return jx.R;
   }

   public dnu c() {
      return this.c;
   }

   public int d() {
      return this.d;
   }
}
