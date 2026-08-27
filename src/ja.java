import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public class ja implements iu {
   public static final Codec<ja> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(djm.b.fieldOf("destination").forGetter($$0x -> $$0x.c), Codec.INT.fieldOf("arrival_in_ticks").forGetter($$0x -> $$0x.d))
            .apply($$0, ja::new)
   );
   public static final iu.a<ja> b = new iu.a<ja>() {
      public ja a(iv<ja> $$0, StringReader $$1) throws CommandSyntaxException {
         $$1.expect(' ');
         float $$2 = (float)$$1.readDouble();
         $$1.expect(' ');
         float $$3 = (float)$$1.readDouble();
         $$1.expect(' ');
         float $$4 = (float)$$1.readDouble();
         $$1.expect(' ');
         int $$5 = $$1.readInt();
         gv $$6 = gv.a((double)$$2, (double)$$3, (double)$$4);
         return new ja(new dje($$6), $$5);
      }

      public ja a(iv<ja> $$0, sh $$1) {
         djm $$2 = djn.c($$1);
         int $$3 = $$1.m();
         return new ja($$2, $$3);
      }
   };
   private final djm c;
   private final int d;

   public ja(djm $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(sh $$0) {
      djn.a(this.c, $$0);
      $$0.c(this.d);
   }

   @Override
   public String a() {
      ehf $$0 = this.c.a(null).get();
      double $$1 = $$0.a();
      double $$2 = $$0.b();
      double $$3 = $$0.c();
      return String.format(Locale.ROOT, "%s %.2f %.2f %.2f %d", jc.k.b(this.b()), $$1, $$2, $$3, this.d);
   }

   @Override
   public iv<ja> b() {
      return iw.P;
   }

   public djm c() {
      return this.c;
   }

   public int d() {
      return this.d;
   }
}
