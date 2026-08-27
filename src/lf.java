import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public class lf implements kz {
   public static final Codec<lf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dxz.c.fieldOf("destination").forGetter(lf::b), Codec.INT.fieldOf("arrival_in_ticks").forGetter(lf::c)).apply($$0, lf::new)
   );
   public static final zc<wp, lf> b = zc.a(dxz.d, lf::b, za.g, lf::c, lf::new);
   public static final kz.a<lf> c = new kz.a<lf>() {
      public lf a(la<lf> $$0, StringReader $$1, jc.a $$2) throws CommandSyntaxException {
         $$1.expect(' ');
         float $$3 = (float)$$1.readDouble();
         $$1.expect(' ');
         float $$4 = (float)$$1.readDouble();
         $$1.expect(' ');
         float $$5 = (float)$$1.readDouble();
         $$1.expect(' ');
         int $$6 = $$1.readInt();
         ir $$7 = ir.a((double)$$3, (double)$$4, (double)$$5);
         return new lf(new dxr($$7), $$6);
      }
   };
   private final dxz d;
   private final int e;

   public lf(dxz $$0, int $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public String a(jc.a $$0) {
      ewu $$1 = this.d.a(null).get();
      double $$2 = $$1.a();
      double $$3 = $$1.b();
      double $$4 = $$1.c();
      return String.format(Locale.ROOT, "%s %.2f %.2f %.2f %d", lh.j.b(this.a()), $$2, $$3, $$4, this.e);
   }

   @Override
   public la<lf> a() {
      return lb.R;
   }

   public dxz b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
