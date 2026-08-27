import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class yg {
   private static final int a = 2097152;
   private final qx b;
   private final byte[] c;
   private final List<yg.a> d;

   public yg(dhq $$0) {
      this.b = new qx();

      for (Entry<dks.a, dks> $$1 : $$0.e()) {
         if ($$1.getKey().b()) {
            this.b.a($$1.getKey().a(), new re($$1.getValue().a()));
         }
      }

      this.c = new byte[a($$0)];
      a(new so(this.c()), $$0);
      this.d = Lists.newArrayList();

      for (Entry<gw, dcv> $$2 : $$0.G().entrySet()) {
         this.d.add(yg.a.a($$2.getValue()));
      }
   }

   public yg(so $$0, int $$1, int $$2) {
      this.b = $$0.p();
      if (this.b == null) {
         throw new RuntimeException("Can't read heightmap in packet for [" + $$1 + ", " + $$2 + "]");
      } else {
         int $$3 = $$0.m();
         if ($$3 > 2097152) {
            throw new RuntimeException("Chunk Packet trying to allocate too much memory on read.");
         } else {
            this.c = new byte[$$3];
            $$0.b(this.c);
            this.d = $$0.a(yg.a::new);
         }
      }
   }

   public void a(so $$0) {
      $$0.a((rq)this.b);
      $$0.c(this.c.length);
      $$0.c(this.c);
      $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
   }

   private static int a(dhq $$0) {
      int $$1 = 0;

      for (dhr $$2 : $$0.d()) {
         $$1 += $$2.j();
      }

      return $$1;
   }

   private ByteBuf c() {
      ByteBuf $$0 = Unpooled.wrappedBuffer(this.c);
      $$0.writerIndex(0);
      return $$0;
   }

   public static void a(so $$0, dhq $$1) {
      for (dhr $$2 : $$1.d()) {
         $$2.c($$0);
      }
   }

   public Consumer<yg.b> a(int $$0, int $$1) {
      return $$2 -> this.a($$2, $$0, $$1);
   }

   private void a(yg.b $$0, int $$1, int $$2) {
      int $$3 = 16 * $$1;
      int $$4 = 16 * $$2;
      gw.a $$5 = new gw.a();

      for (yg.a $$6 : this.d) {
         int $$7 = $$3 + hz.b($$6.a >> 4);
         int $$8 = $$4 + hz.b($$6.a);
         $$5.d($$7, $$6.b, $$8);
         $$0.accept($$5, $$6.c, $$6.d);
      }
   }

   public so a() {
      return new so(Unpooled.wrappedBuffer(this.c));
   }

   public qx b() {
      return this.b;
   }

   static class a {
      final int a;
      final int b;
      final dcx<?> c;
      @Nullable
      final qx d;

      private a(int $$0, int $$1, dcx<?> $$2, @Nullable qx $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      private a(so $$0) {
         this.a = $$0.readByte();
         this.b = $$0.readShort();
         this.c = $$0.a(jd.l);
         this.d = $$0.p();
      }

      void a(so $$0) {
         $$0.k(this.a);
         $$0.l(this.b);
         $$0.a(jd.l, this.c);
         $$0.a((rq)this.d);
      }

      static yg.a a(dcv $$0) {
         qx $$1 = $$0.as_();
         gw $$2 = $$0.p();
         int $$3 = hz.b($$2.u()) << 4 | hz.b($$2.w());
         return new yg.a($$3, $$2.v(), $$0.u(), $$1.g() ? null : $$1);
      }
   }

   @FunctionalInterface
   public interface b {
      void accept(gw var1, dcx<?> var2, @Nullable qx var3);
   }
}
