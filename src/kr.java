import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public class kr implements kl {
   public static final Codec<kr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(duf.c.fieldOf("destination").forGetter(kr::b), Codec.INT.fieldOf("arrival_in_ticks").forGetter(kr::c)).apply($$0, kr::new)
   );
   public static final yg<vt, kr> b = yg.a(duf.d, kr::b, ye.f, kr::c, kr::new);
   public static final kl.a<kr> c = new kl.a<kr>() {
      public kr a(km<kr> $$0, StringReader $$1, ip.a $$2) throws CommandSyntaxException {
         $$1.expect(' ');
         float $$3 = (float)$$1.readDouble();
         $$1.expect(' ');
         float $$4 = (float)$$1.readDouble();
         $$1.expect(' ');
         float $$5 = (float)$$1.readDouble();
         $$1.expect(' ');
         int $$6 = $$1.readInt();
         id $$7 = id.a((double)$$3, (double)$$4, (double)$$5);
         return new kr(new dtx($$7), $$6);
      }
   };
   private final duf d;
   private final int e;

   public kr(duf $$0, int $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public String a(ip.a $$0) {
      esj $$1 = this.d.a(null).get();
      double $$2 = $$1.a();
      double $$3 = $$1.b();
      double $$4 = $$1.c();
      return String.format(Locale.ROOT, "%s %.2f %.2f %.2f %d", kt.j.b(this.a()), $$2, $$3, $$4, this.e);
   }

   @Override
   public km<kr> a() {
      return kn.S;
   }

   public duf b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
