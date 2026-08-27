import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public class lc implements kw {
   public static final MapCodec<lc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dwa.c.fieldOf("destination").forGetter(lc::b), Codec.INT.fieldOf("arrival_in_ticks").forGetter(lc::c)).apply($$0, lc::new)
   );
   public static final yv<wi, lc> b = yv.a(dwa.d, lc::b, yt.f, lc::c, lc::new);
   public static final kw.a<lc> c = new kw.a<lc>() {
      public lc a(kx<lc> $$0, StringReader $$1, iz.a $$2) throws CommandSyntaxException {
         $$1.expect(' ');
         float $$3 = (float)$$1.readDouble();
         $$1.expect(' ');
         float $$4 = (float)$$1.readDouble();
         $$1.expect(' ');
         float $$5 = (float)$$1.readDouble();
         $$1.expect(' ');
         int $$6 = $$1.readInt();
         io $$7 = io.a((double)$$3, (double)$$4, (double)$$5);
         return new lc(new dvs($$7), $$6);
      }
   };
   private final dwa d;
   private final int e;

   public lc(dwa $$0, int $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public String a(iz.a $$0) {
      eum $$1 = this.d.a(null).get();
      double $$2 = $$1.a();
      double $$3 = $$1.b();
      double $$4 = $$1.c();
      return String.format(Locale.ROOT, "%s %.2f %.2f %.2f %d", le.j.b(this.a()), $$2, $$3, $$4, this.e);
   }

   @Override
   public kx<lc> a() {
      return ky.T;
   }

   public dwa b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
