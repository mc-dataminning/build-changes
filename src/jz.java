import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public class jz implements jt {
   public static final Codec<jz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dnd.b.fieldOf("destination").forGetter($$0x -> $$0x.c), Codec.INT.fieldOf("arrival_in_ticks").forGetter($$0x -> $$0x.d))
            .apply($$0, jz::new)
   );
   public static final jt.a<jz> b = new jt.a<jz>() {
      public jz a(ju<jz> $$0, StringReader $$1) throws CommandSyntaxException {
         $$1.expect(' ');
         float $$2 = (float)$$1.readDouble();
         $$1.expect(' ');
         float $$3 = (float)$$1.readDouble();
         $$1.expect(' ');
         float $$4 = (float)$$1.readDouble();
         $$1.expect(' ');
         int $$5 = $$1.readInt();
         hv $$6 = hv.a((double)$$2, (double)$$3, (double)$$4);
         return new jz(new dmv($$6), $$5);
      }

      public jz a(ju<jz> $$0, ue $$1) {
         dnd $$2 = dne.c($$1);
         int $$3 = $$1.n();
         return new jz($$2, $$3);
      }
   };
   private final dnd c;
   private final int d;

   public jz(dnd $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(ue $$0) {
      dne.a(this.c, $$0);
      $$0.c(this.d);
   }

   @Override
   public String a() {
      elb $$0 = this.c.a(null).get();
      double $$1 = $$0.a();
      double $$2 = $$0.b();
      double $$3 = $$0.c();
      return String.format(Locale.ROOT, "%s %.2f %.2f %.2f %d", kb.j.b(this.b()), $$1, $$2, $$3, this.d);
   }

   @Override
   public ju<jz> b() {
      return jv.R;
   }

   public dnd c() {
      return this.c;
   }

   public int d() {
      return this.d;
   }
}
