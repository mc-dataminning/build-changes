import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public class kg implements ka {
   public static final Codec<kg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(drr.c.fieldOf("destination").forGetter(kg::b), Codec.INT.fieldOf("arrival_in_ticks").forGetter(kg::c)).apply($$0, kg::new)
   );
   public static final xs<vf, kg> b = xs.a(drr.d, kg::b, xq.d, kg::c, kg::new);
   public static final ka.a<kg> c = new ka.a<kg>() {
      public kg a(kb<kg> $$0, StringReader $$1, in.a $$2) throws CommandSyntaxException {
         $$1.expect(' ');
         float $$3 = (float)$$1.readDouble();
         $$1.expect(' ');
         float $$4 = (float)$$1.readDouble();
         $$1.expect(' ');
         float $$5 = (float)$$1.readDouble();
         $$1.expect(' ');
         int $$6 = $$1.readInt();
         ib $$7 = ib.a((double)$$3, (double)$$4, (double)$$5);
         return new kg(new drj($$7), $$6);
      }
   };
   private final drr d;
   private final int e;

   public kg(drr $$0, int $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public String a(in.a $$0) {
      epr $$1 = this.d.a(null).get();
      double $$2 = $$1.a();
      double $$3 = $$1.b();
      double $$4 = $$1.c();
      return String.format(Locale.ROOT, "%s %.2f %.2f %.2f %d", ki.j.b(this.a()), $$2, $$3, $$4, this.e);
   }

   @Override
   public kb<kg> a() {
      return kc.S;
   }

   public drr b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
