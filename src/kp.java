import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public class kp implements kj {
   public static final Codec<kp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dtw.c.fieldOf("destination").forGetter(kp::b), Codec.INT.fieldOf("arrival_in_ticks").forGetter(kp::c)).apply($$0, kp::new)
   );
   public static final ye<vr, kp> b = ye.a(dtw.d, kp::b, yc.f, kp::c, kp::new);
   public static final kj.a<kp> c = new kj.a<kp>() {
      public kp a(kk<kp> $$0, StringReader $$1, in.a $$2) throws CommandSyntaxException {
         $$1.expect(' ');
         float $$3 = (float)$$1.readDouble();
         $$1.expect(' ');
         float $$4 = (float)$$1.readDouble();
         $$1.expect(' ');
         float $$5 = (float)$$1.readDouble();
         $$1.expect(' ');
         int $$6 = $$1.readInt();
         ib $$7 = ib.a((double)$$3, (double)$$4, (double)$$5);
         return new kp(new dto($$7), $$6);
      }
   };
   private final dtw d;
   private final int e;

   public kp(dtw $$0, int $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public String a(in.a $$0) {
      esa $$1 = this.d.a(null).get();
      double $$2 = $$1.a();
      double $$3 = $$1.b();
      double $$4 = $$1.c();
      return String.format(Locale.ROOT, "%s %.2f %.2f %.2f %d", kr.j.b(this.a()), $$2, $$3, $$4, this.e);
   }

   @Override
   public kk<kp> a() {
      return kl.S;
   }

   public dtw b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
