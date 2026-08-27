import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public class kd implements jx {
   public static final Codec<kd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dqa.c.fieldOf("destination").forGetter(kd::c), Codec.INT.fieldOf("arrival_in_ticks").forGetter(kd::d)).apply($$0, kd::new)
   );
   public static final xo<vb, kd> b = xo.a(dqa.d, kd::c, xm.d, kd::d, kd::new);
   public static final jx.a<kd> c = new jx.a<kd>() {
      public kd a(jy<kd> $$0, StringReader $$1) throws CommandSyntaxException {
         $$1.expect(' ');
         float $$2 = (float)$$1.readDouble();
         $$1.expect(' ');
         float $$3 = (float)$$1.readDouble();
         $$1.expect(' ');
         float $$4 = (float)$$1.readDouble();
         $$1.expect(' ');
         int $$5 = $$1.readInt();
         hz $$6 = hz.a((double)$$2, (double)$$3, (double)$$4);
         return new kd(new dps($$6), $$5);
      }
   };
   private final dqa d;
   private final int e;

   public kd(dqa $$0, int $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public String a() {
      enz $$0 = this.d.a(null).get();
      double $$1 = $$0.a();
      double $$2 = $$0.b();
      double $$3 = $$0.c();
      return String.format(Locale.ROOT, "%s %.2f %.2f %.2f %d", kf.j.b(this.b()), $$1, $$2, $$3, this.e);
   }

   @Override
   public jy<kd> b() {
      return jz.R;
   }

   public dqa c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
