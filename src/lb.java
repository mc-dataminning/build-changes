import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public class lb implements kv {
   public static final Codec<lb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dve.c.fieldOf("destination").forGetter(lb::b), Codec.INT.fieldOf("arrival_in_ticks").forGetter(lb::c)).apply($$0, lb::new)
   );
   public static final ys<wf, lb> b = ys.a(dve.d, lb::b, yq.f, lb::c, lb::new);
   public static final kv.a<lb> c = new kv.a<lb>() {
      public lb a(kw<lb> $$0, StringReader $$1, iy.a $$2) throws CommandSyntaxException {
         $$1.expect(' ');
         float $$3 = (float)$$1.readDouble();
         $$1.expect(' ');
         float $$4 = (float)$$1.readDouble();
         $$1.expect(' ');
         float $$5 = (float)$$1.readDouble();
         $$1.expect(' ');
         int $$6 = $$1.readInt();
         in $$7 = in.a((double)$$3, (double)$$4, (double)$$5);
         return new lb(new duw($$7), $$6);
      }
   };
   private final dve d;
   private final int e;

   public lb(dve $$0, int $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public String a(iy.a $$0) {
      etp $$1 = this.d.a(null).get();
      double $$2 = $$1.a();
      double $$3 = $$1.b();
      double $$4 = $$1.c();
      return String.format(Locale.ROOT, "%s %.2f %.2f %.2f %d", ld.j.b(this.a()), $$2, $$3, $$4, this.e);
   }

   @Override
   public kw<lb> a() {
      return kx.R;
   }

   public dve b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
