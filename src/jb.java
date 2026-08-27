import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public class jb implements iv {
   public static final Codec<jb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(djs.b.fieldOf("destination").forGetter($$0x -> $$0x.c), Codec.INT.fieldOf("arrival_in_ticks").forGetter($$0x -> $$0x.d))
            .apply($$0, jb::new)
   );
   public static final iv.a<jb> b = new iv.a<jb>() {
      public jb a(iw<jb> $$0, StringReader $$1) throws CommandSyntaxException {
         $$1.expect(' ');
         float $$2 = (float)$$1.readDouble();
         $$1.expect(' ');
         float $$3 = (float)$$1.readDouble();
         $$1.expect(' ');
         float $$4 = (float)$$1.readDouble();
         $$1.expect(' ');
         int $$5 = $$1.readInt();
         gw $$6 = gw.a((double)$$2, (double)$$3, (double)$$4);
         return new jb(new djk($$6), $$5);
      }

      public jb a(iw<jb> $$0, sl $$1) {
         djs $$2 = djt.c($$1);
         int $$3 = $$1.m();
         return new jb($$2, $$3);
      }
   };
   private final djs c;
   private final int d;

   public jb(djs $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(sl $$0) {
      djt.a(this.c, $$0);
      $$0.c(this.d);
   }

   @Override
   public String a() {
      ehi $$0 = this.c.a(null).get();
      double $$1 = $$0.a();
      double $$2 = $$0.b();
      double $$3 = $$0.c();
      return String.format(Locale.ROOT, "%s %.2f %.2f %.2f %d", jd.k.b(this.b()), $$1, $$2, $$3, this.d);
   }

   @Override
   public iw<jb> b() {
      return ix.P;
   }

   public djs c() {
      return this.c;
   }

   public int d() {
      return this.d;
   }
}
