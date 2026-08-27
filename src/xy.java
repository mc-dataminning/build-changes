import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class xy {
   private static final int a = 2097152;
   private final qs b;
   private final byte[] c;
   private final List<xy.a> d;

   public xy(dhf $$0) {
      this.b = new qs();

      for (Entry<dkh.a, dkh> $$1 : $$0.e()) {
         if ($$1.getKey().b()) {
            this.b.a($$1.getKey().a(), new qz($$1.getValue().a()));
         }
      }

      this.c = new byte[a($$0)];
      a(new sh(this.c()), $$0);
      this.d = Lists.newArrayList();

      for (Entry<gv, dck> $$2 : $$0.G().entrySet()) {
         this.d.add(xy.a.a($$2.getValue()));
      }
   }

   public xy(sh $$0, int $$1, int $$2) {
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
            this.d = $$0.a(xy.a::new);
         }
      }
   }

   public void a(sh $$0) {
      $$0.a((rl)this.b);
      $$0.c(this.c.length);
      $$0.c(this.c);
      $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
   }

   private static int a(dhf $$0) {
      int $$1 = 0;

      for (dhg $$2 : $$0.d()) {
         $$1 += $$2.j();
      }

      return $$1;
   }

   private ByteBuf c() {
      ByteBuf $$0 = Unpooled.wrappedBuffer(this.c);
      $$0.writerIndex(0);
      return $$0;
   }

   public static void a(sh $$0, dhf $$1) {
      for (dhg $$2 : $$1.d()) {
         $$2.c($$0);
      }
   }

   public Consumer<xy.b> a(int $$0, int $$1) {
      return $$2 -> this.a($$2, $$0, $$1);
   }

   private void a(xy.b $$0, int $$1, int $$2) {
      int $$3 = 16 * $$1;
      int $$4 = 16 * $$2;
      gv.a $$5 = new gv.a();

      for (xy.a $$6 : this.d) {
         int $$7 = $$3 + hy.b($$6.a >> 4);
         int $$8 = $$4 + hy.b($$6.a);
         $$5.d($$7, $$6.b, $$8);
         $$0.accept($$5, $$6.c, $$6.d);
      }
   }

   public sh a() {
      return new sh(Unpooled.wrappedBuffer(this.c));
   }

   public qs b() {
      return this.b;
   }

   static class a {
      final int a;
      final int b;
      final dcm<?> c;
      @Nullable
      final qs d;

      private a(int $$0, int $$1, dcm<?> $$2, @Nullable qs $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      private a(sh $$0) {
         this.a = $$0.readByte();
         this.b = $$0.readShort();
         this.c = $$0.a(jc.l);
         this.d = $$0.p();
      }

      void a(sh $$0) {
         $$0.k(this.a);
         $$0.l(this.b);
         $$0.a(jc.l, this.c);
         $$0.a((rl)this.d);
      }

      static xy.a a(dck $$0) {
         qs $$1 = $$0.ao_();
         gv $$2 = $$0.p();
         int $$3 = hy.b($$2.u()) << 4 | hy.b($$2.w());
         return new xy.a($$3, $$2.v(), $$0.u(), $$1.g() ? null : $$1);
      }
   }

   @FunctionalInterface
   public interface b {
      void accept(gv var1, dcm<?> var2, @Nullable qs var3);
   }
}
