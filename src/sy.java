import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.util.Either;
import io.netty.channel.ChannelHandler;
import io.netty.channel.embedded.EmbeddedChannel;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.LongStream;
import javax.annotation.Nullable;

public class sy {
   private final sz a;
   private boolean b;

   public sy(sz $$0) {
      this.a = $$0;
   }

   public aqn a() {
      return this.a.f();
   }

   public drd a(io $$0) {
      return this.a().a_(this.j($$0));
   }

   @Nullable
   public doi b(io $$0) {
      return this.a().c_(this.j($$0));
   }

   public void b() {
      this.a(brw.class);
   }

   public void a(Class $$0) {
      euh $$1 = this.i();
      List<brw> $$2 = this.a().a($$0, $$1.g(1.0), $$0x -> !($$0x instanceof cly));
      $$2.forEach(brw::an);
   }

   public cii a(ctl $$0, eum $$1) {
      aqn $$2 = this.a();
      eum $$3 = this.a($$1);
      cii $$4 = new cii($$2, $$3.c, $$3.d, $$3.e, new ctq($$0, 1));
      $$4.o(0.0, 0.0, 0.0);
      $$2.b($$4);
      return $$4;
   }

   public cii a(ctl $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new eum((double)$$1, (double)$$2, (double)$$3));
   }

   public cii a(ctl $$0, io $$1) {
      return this.a($$0, (float)$$1.u(), (float)$$1.v(), (float)$$1.w());
   }

   public <E extends brw> E a(bsc<E> $$0, io $$1) {
      return this.a($$0, eum.c($$1));
   }

   public <E extends brw> E a(bsc<E> $$0, eum $$1) {
      aqn $$2 = this.a();
      E $$3 = $$0.a((daz)$$2);
      if ($$3 == null) {
         throw new NullPointerException("Failed to create entity " + $$0.r().h().a());
      } else {
         if ($$3 instanceof bss $$4) {
            $$4.fT();
         }

         eum $$5 = this.a($$1);
         $$3.b($$5.c, $$5.d, $$5.e, $$3.dF(), $$3.dH());
         $$2.b($$3);
         return $$3;
      }
   }

   public <E extends brw> E a(bsc<E> $$0) {
      return this.a($$0, 0, 0, 0, 2.147483647E9);
   }

   public <E extends brw> E a(bsc<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      List<E> $$5 = this.b($$0, $$1, $$2, $$3, $$4);
      if ($$5.isEmpty()) {
         throw new sr("Expected " + $$0.j() + " to exist around " + $$1 + "," + $$2 + "," + $$3);
      } else if ($$5.size() > 1) {
         throw new sr("Expected only one " + $$0.j() + " to exist around " + $$1 + "," + $$2 + "," + $$3 + ", but found " + $$5.size());
      } else {
         eum $$6 = this.a(new eum((double)$$1, (double)$$2, (double)$$3));
         $$5.sort(($$1x, $$2x) -> {
            double $$3x = $$1x.dn().f($$6);
            double $$4x = $$2x.dn().f($$6);
            return Double.compare($$3x, $$4x);
         });
         return $$5.get(0);
      }
   }

   public <E extends brw> List<E> b(bsc<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      return this.a($$0, eum.c(new io($$1, $$2, $$3)), $$4);
   }

   public <E extends brw> List<E> a(bsc<E> $$0, eum $$1, double $$2) {
      aqn $$3 = this.a();
      eum $$4 = this.a($$1);
      euh $$5 = this.a.d();
      euh $$6 = new euh($$4.b(-$$2, -$$2, -$$2), $$4.b($$2, $$2, $$2));
      return $$3.a($$0, $$5, $$1x -> $$1x.cK().c($$6) && $$1x.bD());
   }

   public <E extends brw> E a(bsc<E> $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, new io($$1, $$2, $$3));
   }

   public <E extends brw> E a(bsc<E> $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new eum((double)$$1, (double)$$2, (double)$$3));
   }

   public <E extends bss> E b(bsc<E> $$0, io $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gk();
      return $$2;
   }

   public <E extends bss> E b(bsc<E> $$0, int $$1, int $$2, int $$3) {
      return this.b($$0, new io($$1, $$2, $$3));
   }

   public <E extends bss> E b(bsc<E> $$0, eum $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gk();
      return $$2;
   }

   public <E extends bss> E b(bsc<E> $$0, float $$1, float $$2, float $$3) {
      return this.b($$0, new eum((double)$$1, (double)$$2, (double)$$3));
   }

   public void a(bss $$0, float $$1, float $$2, float $$3) {
      eum $$4 = this.a(new eum((double)$$1, (double)$$2, (double)$$3));
      $$0.b($$4.c, $$4.d, $$4.e, $$0.dF(), $$0.dH());
   }

   public td a(bss $$0, io $$1, float $$2) {
      return this.g().a(2, () -> {
         enk $$3 = $$0.K().a(this.j($$1), 0);
         $$0.K().a($$3, (double)$$2);
      });
   }

   public void a(int $$0, int $$1, int $$2) {
      this.c(new io($$0, $$1, $$2));
   }

   public void c(io $$0) {
      this.b($$0, $$0x -> $$0x.a(avx.f), () -> "Expected button");
      io $$1 = this.j($$0);
      drd $$2 = this.a().a_($$1);
      dek $$3 = (dek)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void d(io $$0) {
      this.a($$0, this.a(daw.b));
   }

   public void a(io $$0, cly $$1) {
      io $$2 = this.j($$0);
      this.a($$0, $$1, new eui(eum.b($$2), it.c, $$2, true));
   }

   public void a(io $$0, cly $$1, eui $$2) {
      io $$3 = this.j($$0);
      drd $$4 = this.a().a_($$3);
      bpv $$5 = bpv.a;
      bpy $$6 = $$4.a($$1.b($$5), this.a(), $$1, $$5, $$2);
      if (!$$6.a()) {
         if ($$6 != bpy.d || !$$4.a(this.a(), $$1, $$2).a()) {
            cxd $$7 = new cxd($$1, $$5, $$2);
            $$1.b($$5).a($$7);
         }
      }
   }

   public bsq a(bsq $$0) {
      $$0.k(0);
      $$0.t(0.25F);
      return $$0;
   }

   public bsq b(bsq $$0) {
      $$0.t(0.25F);
      return $$0;
   }

   public cly a(final daw $$0) {
      return new cly(this.a(), io.c, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
         @Override
         public boolean N_() {
            return $$0 == daw.d;
         }

         @Override
         public boolean f() {
            return $$0.g();
         }

         @Override
         public boolean g() {
            return true;
         }
      };
   }

   @Deprecated(
      forRemoval = true
   )
   public aqo c() {
      arc $$0 = arc.a(new GameProfile(UUID.randomUUID(), "test-mock-player"), false);
      aqo $$1 = new aqo(this.a().o(), this.a(), $$0.a(), $$0.c()) {
         @Override
         public boolean N_() {
            return false;
         }

         @Override
         public boolean f() {
            return true;
         }
      };
      vv $$2 = new vv(zf.a);
      new EmbeddedChannel(new ChannelHandler[]{$$2});
      this.a().o().ah().a($$2, $$1, $$0);
      return $$1;
   }

   public void b(int $$0, int $$1, int $$2) {
      this.e(new io($$0, $$1, $$2));
   }

   public void e(io $$0) {
      this.a(dec.dw, $$0);
      io $$1 = this.j($$0);
      drd $$2 = this.a().a_($$1);
      din $$3 = (din)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void a(io $$0, long $$1) {
      this.a($$0, dec.ha);
      this.b($$1, () -> this.a($$0, dec.a));
   }

   public void f(io $$0) {
      this.a().a(this.j($$0), false, null);
   }

   public void a(int $$0, int $$1, int $$2, dea $$3) {
      this.a(new io($$0, $$1, $$2), $$3);
   }

   public void a(int $$0, int $$1, int $$2, drd $$3) {
      this.a(new io($$0, $$1, $$2), $$3);
   }

   public void a(io $$0, dea $$1) {
      this.a($$0, $$1.n());
   }

   public void a(io $$0, drd $$1) {
      this.a().a(this.j($$0), $$1, 3);
   }

   public void d() {
      this.a(13000);
   }

   public void a(int $$0) {
      this.a().b((long)$$0);
   }

   public void a(dea $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new io($$1, $$2, $$3));
   }

   public void a(dea $$0, io $$1) {
      drd $$2 = this.a($$1);
      this.a($$1, $$2x -> $$2.a($$0), "Expected " + $$0.f().getString() + ", got " + $$2.b().f().getString());
   }

   public void b(dea $$0, int $$1, int $$2, int $$3) {
      this.b($$0, new io($$1, $$2, $$3));
   }

   public void b(dea $$0, io $$1) {
      this.a($$1, $$2 -> !this.a($$1).a($$0), "Did not expect " + $$0.f().getString());
   }

   public void c(dea $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new io($$1, $$2, $$3));
   }

   public void c(dea $$0, io $$1) {
      this.b(() -> this.a($$0, $$1));
   }

   public void a(io $$0, Predicate<dea> $$1, String $$2) {
      this.a($$0, $$1, () -> $$2);
   }

   public void a(io $$0, Predicate<dea> $$1, Supplier<String> $$2) {
      this.b($$0, $$1x -> $$1.test($$1x.b()), $$2);
   }

   public <T extends Comparable<T>> void a(io $$0, dsg<T> $$1, T $$2) {
      drd $$3 = this.a($$0);
      boolean $$4 = $$3.b($$1);
      if (!$$4 || !$$3.<T>c($$1).equals($$2)) {
         String $$5 = $$4 ? "was " + $$3.c($$1) : "property " + $$1.f() + " is missing";
         String $$6 = String.format(Locale.ROOT, "Expected property %s to be %s, %s", $$1.f(), $$2, $$5);
         throw new ss($$6, this.j($$0), $$0, this.a.o());
      }
   }

   public <T extends Comparable<T>> void a(io $$0, dsg<T> $$1, Predicate<T> $$2, String $$3) {
      this.b($$0, $$2x -> {
         if (!$$2x.b($$1)) {
            return false;
         } else {
            T $$3x = $$2x.c($$1);
            return $$2.test($$3x);
         }
      }, () -> $$3);
   }

   public void b(io $$0, Predicate<drd> $$1, Supplier<String> $$2) {
      drd $$3 = this.a($$0);
      if (!$$1.test($$3)) {
         throw new ss($$2.get(), this.j($$0), $$0, this.a.o());
      }
   }

   public void a(io $$0, it $$1, IntPredicate $$2, Supplier<String> $$3) {
      io $$4 = this.j($$0);
      aqn $$5 = this.a();
      drd $$6 = $$5.a_($$4);
      int $$7 = $$6.b($$5, $$4, $$1);
      if (!$$2.test($$7)) {
         throw new ss($$3.get(), $$4, $$0, this.a.o());
      }
   }

   public void b(bsc<?> $$0) {
      List<? extends brw> $$1 = this.a().a($$0, this.i(), brw::bD);
      if ($$1.isEmpty()) {
         throw new sr("Expected " + $$0.j() + " to exist");
      }
   }

   public void c(bsc<?> $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new io($$1, $$2, $$3));
   }

   public void c(bsc<?> $$0, io $$1) {
      io $$2 = this.j($$1);
      List<? extends brw> $$3 = this.a().a($$0, new euh($$2), brw::bD);
      if ($$3.isEmpty()) {
         throw new ss("Expected " + $$0.j(), $$2, $$1, this.a.o());
      }
   }

   public void a(bsc<?> $$0, eum $$1, eum $$2) {
      List<? extends brw> $$3 = this.a().a($$0, new euh($$1, $$2), brw::bD);
      if ($$3.isEmpty()) {
         throw new ss("Expected " + $$0.j() + " between ", io.a($$1), io.a($$2), this.a.o());
      }
   }

   public void a(bsc<?> $$0, int $$1) {
      List<? extends brw> $$2 = this.a().a($$0, this.i(), brw::bD);
      if ($$2.size() != $$1) {
         throw new sr("Expected " + $$1 + " of type " + $$0.j() + " to exist, found " + $$2.size());
      }
   }

   public void a(bsc<?> $$0, io $$1, int $$2, double $$3) {
      io $$4 = this.j($$1);
      List<? extends brw> $$5 = this.b((bsc<? extends brw>)$$0, $$1, $$3);
      if ($$5.size() != $$2) {
         throw new ss("Expected " + $$2 + " entities of type " + $$0.j() + ", actual number of entities found=" + $$5.size(), $$4, $$1, this.a.o());
      }
   }

   public void a(bsc<?> $$0, io $$1, double $$2) {
      List<? extends brw> $$3 = this.b((bsc<? extends brw>)$$0, $$1, $$2);
      if ($$3.isEmpty()) {
         io $$4 = this.j($$1);
         throw new ss("Expected " + $$0.j(), $$4, $$1, this.a.o());
      }
   }

   public <T extends brw> List<T> b(bsc<T> $$0, io $$1, double $$2) {
      io $$3 = this.j($$1);
      return this.a().a($$0, new euh($$3).g($$2), brw::bD);
   }

   public <T extends brw> List<T> c(bsc<T> $$0) {
      return this.a().a($$0, this.i(), brw::bD);
   }

   public void a(brw $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new io($$1, $$2, $$3));
   }

   public void a(brw $$0, io $$1) {
      io $$2 = this.j($$1);
      List<? extends brw> $$3 = this.a().a($$0.ak(), new euh($$2), brw::bD);
      $$3.stream().filter($$1x -> $$1x == $$0).findFirst().orElseThrow(() -> new ss("Expected " + $$0.ak().j(), $$2, $$1, this.a.o()));
   }

   public void a(ctl $$0, io $$1, double $$2, int $$3) {
      io $$4 = this.j($$1);
      List<cii> $$5 = this.a().a(bsc.ag, new euh($$4).g($$2), brw::bD);
      int $$6 = 0;

      for (cii $$7 : $$5) {
         ctq $$8 = $$7.p();
         if ($$8.a($$0)) {
            $$6 += $$8.I();
         }
      }

      if ($$6 != $$3) {
         throw new ss("Expected " + $$3 + " " + $$0.s().getString() + " items to exist (found " + $$6 + ")", $$4, $$1, this.a.o());
      }
   }

   public void a(ctl $$0, io $$1, double $$2) {
      io $$3 = this.j($$1);

      for (brw $$5 : this.a().a(bsc.ag, new euh($$3).g($$2), brw::bD)) {
         cii $$6 = (cii)$$5;
         if ($$6.p().g().equals($$0)) {
            return;
         }
      }

      throw new ss("Expected " + $$0.s().getString() + " item", $$3, $$1, this.a.o());
   }

   public void b(ctl $$0, io $$1, double $$2) {
      io $$3 = this.j($$1);

      for (brw $$5 : this.a().a(bsc.ag, new euh($$3).g($$2), brw::bD)) {
         cii $$6 = (cii)$$5;
         if ($$6.p().g().equals($$0)) {
            throw new ss("Did not expect " + $$0.s().getString() + " item", $$3, $$1, this.a.o());
         }
      }
   }

   public void a(ctl $$0) {
      for (brw $$2 : this.a().a(bsc.ag, this.i(), brw::bD)) {
         cii $$3 = (cii)$$2;
         if ($$3.p().g().equals($$0)) {
            return;
         }
      }

      throw new sr("Expected " + $$0.s().getString() + " item");
   }

   public void b(ctl $$0) {
      for (brw $$2 : this.a().a(bsc.ag, this.i(), brw::bD)) {
         cii $$3 = (cii)$$2;
         if ($$3.p().g().equals($$0)) {
            throw new sr("Did not expect " + $$0.s().getString() + " item");
         }
      }
   }

   public void d(bsc<?> $$0) {
      List<? extends brw> $$1 = this.a().a($$0, this.i(), brw::bD);
      if (!$$1.isEmpty()) {
         throw new sr("Did not expect " + $$0.j() + " to exist");
      }
   }

   public void d(bsc<?> $$0, int $$1, int $$2, int $$3) {
      this.d($$0, new io($$1, $$2, $$3));
   }

   public void d(bsc<?> $$0, io $$1) {
      io $$2 = this.j($$1);
      List<? extends brw> $$3 = this.a().a($$0, new euh($$2), brw::bD);
      if (!$$3.isEmpty()) {
         throw new ss("Did not expect " + $$0.j(), $$2, $$1, this.a.o());
      }
   }

   public void a(bsc<?> $$0, double $$1, double $$2, double $$3) {
      eum $$4 = new eum($$1, $$2, $$3);
      eum $$5 = this.a($$4);
      Predicate<? super brw> $$6 = $$1x -> $$1x.cK().a($$5, $$5);
      List<? extends brw> $$7 = this.a().a($$0, this.i(), $$6);
      if ($$7.isEmpty()) {
         throw new sr("Expected " + $$0.j() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public void b(bsc<?> $$0, double $$1, double $$2, double $$3) {
      eum $$4 = new eum($$1, $$2, $$3);
      eum $$5 = this.a($$4);
      Predicate<? super brw> $$6 = $$1x -> !$$1x.cK().a($$5, $$5);
      List<? extends brw> $$7 = this.a().a($$0, this.i(), $$6);
      if ($$7.isEmpty()) {
         throw new sr("Did not expect " + $$0.j() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public <E extends brw, T> void a(io $$0, bsc<E> $$1, Function<? super E, T> $$2, @Nullable T $$3) {
      io $$4 = this.j($$0);
      List<E> $$5 = this.a().a($$1, new euh($$4), brw::bD);
      if ($$5.isEmpty()) {
         throw new ss("Expected " + $$1.j(), $$4, $$0, this.a.o());
      } else {
         for (E $$6 : $$5) {
            T $$7 = $$2.apply($$6);
            if ($$7 == null) {
               if ($$3 != null) {
                  throw new sr("Expected entity data to be: " + $$3 + ", but was: " + $$7);
               }
            } else if (!$$7.equals($$3)) {
               throw new sr("Expected entity data to be: " + $$3 + ", but was: " + $$7);
            }
         }
      }
   }

   public <E extends bsq> void a(io $$0, bsc<E> $$1, ctl $$2) {
      io $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new euh($$3), brw::bD);
      if ($$4.isEmpty()) {
         throw new ss("Expected entity of type: " + $$1, $$3, $$0, this.h());
      } else {
         for (E $$5 : $$4) {
            if ($$5.b($$2)) {
               return;
            }
         }

         throw new ss("Entity should be holding: " + $$2, $$3, $$0, this.h());
      }
   }

   public <E extends brw & clj> void b(io $$0, bsc<E> $$1, ctl $$2) {
      io $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new euh($$3), $$0x -> ((brw)$$0x).bD());
      if ($$4.isEmpty()) {
         throw new ss("Expected " + $$1.j() + " to exist", $$3, $$0, this.h());
      } else {
         for (E $$5 : $$4) {
            if ($$5.y().a_($$1x -> $$1x.a($$2))) {
               return;
            }
         }

         throw new ss("Entity inventory should contain: " + $$2, $$3, $$0, this.h());
      }
   }

   public void g(io $$0) {
      io $$1 = this.j($$0);
      doi $$2 = this.a().c_($$1);
      if ($$2 instanceof doc && !((doc)$$2).c()) {
         throw new sr("Container should be empty");
      }
   }

   public void a(io $$0, ctl $$1) {
      io $$2 = this.j($$0);
      doi $$3 = this.a().c_($$2);
      if (!($$3 instanceof doc)) {
         throw new sr("Expected a container at " + $$0 + ", found " + le.k.b($$3.r()));
      } else if (((doc)$$3).a_($$1) != 1) {
         throw new sr("Container should contain: " + $$1);
      }
   }

   public void a(ehd $$0, io $$1) {
      io.a($$0).forEach($$2 -> {
         io $$3 = $$1.b($$2.u() - $$0.h(), $$2.v() - $$0.i(), $$2.w() - $$0.j());
         this.a($$2, $$3);
      });
   }

   public void a(io $$0, io $$1) {
      drd $$2 = this.a($$0);
      drd $$3 = this.a($$1);
      if ($$2 != $$3) {
         this.a("Incorrect state. Expected " + $$3 + ", got " + $$2, $$0);
      }
   }

   public void a(long $$0, io $$1, ctl $$2) {
      this.a($$0, () -> this.a($$1, $$2));
   }

   public void a(long $$0, io $$1) {
      this.a($$0, () -> this.g($$1));
   }

   public <E extends brw, T> void b(io $$0, bsc<E> $$1, Function<E, T> $$2, T $$3) {
      this.b(() -> this.a($$0, $$1, $$2, $$3));
   }

   public <E extends brw> void a(E $$0, Predicate<E> $$1, String $$2) {
      if (!$$1.test($$0)) {
         throw new sr("Entity " + $$0 + " failed " + $$2 + " test");
      }
   }

   public <E extends brw, T> void a(E $$0, Function<E, T> $$1, String $$2, T $$3) {
      T $$4 = $$1.apply($$0);
      if (!$$4.equals($$3)) {
         throw new sr("Entity " + $$0 + " value " + $$2 + "=" + $$4 + " is not equal to expected " + $$3);
      }
   }

   public void a(bsq $$0, ix<brc> $$1, int $$2) {
      bre $$3 = $$0.c($$1);
      if ($$3 == null || $$3.e() != $$2) {
         int $$4 = $$2 + 1;
         throw new sr("Entity " + $$0 + " failed has " + $$1.a().d() + " x " + $$4 + " test");
      }
   }

   public void e(bsc<?> $$0, int $$1, int $$2, int $$3) {
      this.e($$0, new io($$1, $$2, $$3));
   }

   public void e(bsc<?> $$0, io $$1) {
      this.b(() -> this.c($$0, $$1));
   }

   public void f(bsc<?> $$0, int $$1, int $$2, int $$3) {
      this.f($$0, new io($$1, $$2, $$3));
   }

   public void f(bsc<?> $$0, io $$1) {
      this.b(() -> this.d($$0, $$1));
   }

   public void e() {
      this.a.l();
   }

   private void j() {
      if (this.b) {
         throw new IllegalStateException("This test already has final clause");
      } else {
         this.b = true;
      }
   }

   public void a(Runnable $$0) {
      this.j();
      this.a.p().a(0L, $$0).a();
   }

   public void b(Runnable $$0) {
      this.j();
      this.a.p().a($$0).a();
   }

   public void a(int $$0, Runnable $$1) {
      this.j();
      this.a.p().a((long)$$0, $$1).a();
   }

   public void a(long $$0, Runnable $$1) {
      this.a.a($$0, $$1);
   }

   public void b(long $$0, Runnable $$1) {
      this.a(this.a.o() + $$0, $$1);
   }

   public void h(io $$0) {
      io $$1 = this.j($$0);
      aqn $$2 = this.a();
      $$2.a_($$1).b($$2, $$1, $$2.z);
   }

   public void i(io $$0) {
      io $$1 = this.j($$0);
      aqn $$2 = this.a();
      $$2.a($$1);
   }

   public void f() {
      euh $$0 = this.k();
      int $$1 = (int)Math.floor($$0.d);
      int $$2 = (int)Math.floor($$0.f);
      int $$3 = (int)Math.floor($$0.e);

      for (int $$4 = (int)Math.floor($$0.a); $$4 < $$1; $$4++) {
         for (int $$5 = (int)Math.floor($$0.c); $$5 < $$2; $$5++) {
            this.i(new io($$4, $$3, $$5));
         }
      }
   }

   public int a(dwv.a $$0, int $$1, int $$2) {
      io $$3 = this.j(new io($$1, 0, $$2));
      return this.k(this.a().a($$0, $$3)).v();
   }

   public void a(String $$0, io $$1) {
      throw new ss($$0, this.j($$1), $$1, this.h());
   }

   public void a(String $$0, brw $$1) {
      throw new ss($$0, $$1.dp(), this.k($$1.dp()), this.h());
   }

   public void a(String $$0) {
      throw new sr($$0);
   }

   public void c(Runnable $$0) {
      this.a.p().a($$0).a(() -> new sr("Fail conditions met"));
   }

   public void d(Runnable $$0) {
      LongStream.range(this.a.o(), (long)this.a.v()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public td g() {
      return this.a.p();
   }

   public io j(io $$0) {
      io $$1 = this.a.c();
      io $$2 = $$1.a((js)$$0);
      return ell.a($$2, dix.a, this.a.t(), $$1);
   }

   public io k(io $$0) {
      io $$1 = this.a.c();
      dkn $$2 = this.a.t().a(dkn.c);
      io $$3 = ell.a($$0, dix.a, $$2, $$1);
      return $$3.b($$1);
   }

   public eum a(eum $$0) {
      eum $$1 = eum.a(this.a.c());
      return ell.a($$1.e($$0), dix.a, this.a.t(), this.a.c());
   }

   public eum b(eum $$0) {
      eum $$1 = eum.a(this.a.c());
      return ell.a($$0.d($$1), dix.a, this.a.t(), this.a.c());
   }

   public void a(boolean $$0, String $$1) {
      if (!$$0) {
         throw new sr($$1);
      }
   }

   public <N> void a(N $$0, N $$1, String $$2) {
      if (!$$0.equals($$1)) {
         throw new sr("Expected " + $$2 + " to be " + $$1 + ", but was " + $$0);
      }
   }

   public void b(boolean $$0, String $$1) {
      if ($$0) {
         throw new sr($$1);
      }
   }

   public long h() {
      return this.a.o();
   }

   public euh i() {
      return this.a.d();
   }

   private euh k() {
      euh $$0 = this.a.d();
      return $$0.a(io.c.b(this.j(io.c)));
   }

   public void a(Consumer<io> $$0) {
      euh $$1 = this.k().a(1.0, 1.0, 1.0);
      io.a.a($$1).forEach($$0);
   }

   public void e(Runnable $$0) {
      LongStream.range(this.a.o(), (long)this.a.v()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public void a(cly $$0, ctq $$1, io $$2, it $$3) {
      io $$4 = this.j($$2.a($$3));
      eui $$5 = new eui(eum.b($$4), $$3, $$4, false);
      cxd $$6 = new cxd($$0, bpv.a, $$5);
      $$1.a($$6);
   }

   public void a(akm<dby> $$0) {
      euh $$1 = this.i();
      io $$2 = io.a($$1.a, $$1.b, $$1.c);
      io $$3 = io.a($$1.d, $$1.e, $$1.f);
      Either<Integer, CommandSyntaxException> $$4 = amq.a(this.a(), $$2, $$3, this.a().H_().d(lf.az).g($$0));
      if ($$4.right().isPresent()) {
         this.a("Failed to set biome for test");
      }
   }
}
