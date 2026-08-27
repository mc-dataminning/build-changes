import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public class kf implements jz {
   public static final Codec<kf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dqv.c.fieldOf("destination").forGetter(kf::b), Codec.INT.fieldOf("arrival_in_ticks").forGetter(kf::c)).apply($$0, kf::new)
   );
   public static final xq<vd, kf> b = xq.a(dqv.d, kf::b, xo.d, kf::c, kf::new);
   public static final jz.a<kf> c = new jz.a<kf>() {
      public kf a(ka<kf> $$0, StringReader $$1, in.a $$2) throws CommandSyntaxException {
         $$1.expect(' ');
         float $$3 = (float)$$1.readDouble();
         $$1.expect(' ');
         float $$4 = (float)$$1.readDouble();
         $$1.expect(' ');
         float $$5 = (float)$$1.readDouble();
         $$1.expect(' ');
         int $$6 = $$1.readInt();
         ib $$7 = ib.a((double)$$3, (double)$$4, (double)$$5);
         return new kf(new dqn($$7), $$6);
      }
   };
   private final dqv d;
   private final int e;

   public kf(dqv $$0, int $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public String a(in.a $$0) {
      eov $$1 = this.d.a(null).get();
      double $$2 = $$1.a();
      double $$3 = $$1.b();
      double $$4 = $$1.c();
      return String.format(Locale.ROOT, "%s %.2f %.2f %.2f %d", kh.j.b(this.a()), $$2, $$3, $$4, this.e);
   }

   @Override
   public ka<kf> a() {
      return kb.R;
   }

   public dqv b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
