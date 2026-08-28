import com.google.common.collect.EvictingQueue;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gki implements auj {
   private static final Logger b = LogUtils.getLogger();
   private static final akn c = akn.a("particles");
   private static final aku d = aku.b("particles");
   private static final int e = 16384;
   private static final List<gkk> f = List.of(gkk.a, gkk.b, gkk.c);
   protected ggy a;
   private final Map<gkk, Queue<gkg>> g = Maps.newIdentityHashMap();
   private final Queue<gli> h = Queues.newArrayDeque();
   private final hft i;
   private final azh j = azh.a();
   private final Int2ObjectMap<gkj<?>> k = new Int2ObjectOpenHashMap();
   private final Queue<gkg> l = Queues.newArrayDeque();
   private final Map<aku, gki.b> m = Maps.newHashMap();
   private final hfq n;
   private final Object2IntOpenHashMap<lq> o = new Object2IntOpenHashMap();

   public gki(ggy $$0, hft $$1) {
      this.n = new hfq(hfq.e);
      $$1.a(this.n.g(), this.n);
      this.a = $$0;
      this.i = $$1;
      this.e();
   }

   private void e() {
      this.a(lt.a, gjx.a::new);
      this.a(lt.c, new giz.a());
      this.a(lt.b, new glf.c());
      this.a(lt.d, gjc.a::new);
      this.a(lt.at, gjb.a::new);
      this.a(lt.ar, gjd.a::new);
      this.a(lt.aw, gje.a::new);
      this.a(lt.ax, gje.b::new);
      this.a(lt.e, gkl.a::new);
      this.a(lt.R, gle.a::new);
      this.a(lt.f, gjf.c::new);
      this.a(lt.as, gln.a::new);
      this.a(lt.g, gjf.a::new);
      this.a(lt.h, gjg.a::new);
      this.a(lt.av, gle.b::new);
      this.a(lt.i, gjh::c);
      this.a(lt.j, gjh::d);
      this.a(lt.k, gjh::e);
      this.a(lt.l, gjh::a);
      this.a(lt.m, gjh::b);
      this.a(lt.n, gjj.a::new);
      this.a(lt.o, gji.a::new);
      this.a(lt.p, gky.c::new);
      this.a(lt.q, new gkd.a());
      this.a(lt.r, gjf.b::new);
      this.a(lt.s, gjt.a::new);
      this.a(lt.t, gjm.a::new);
      this.a(lt.u, gky.b::new);
      this.a(lt.v, new gjz.a());
      this.a(lt.w, gjy.a::new);
      this.a(lt.B, gkw.a::new);
      this.a(lt.C, gjo.a::new);
      this.a(lt.x, gjv.a::new);
      this.a(lt.y, gjv.b::new);
      this.a(lt.z, new gjw.a(3.0, 7, 0));
      this.a(lt.A, new gjw.a(1.0, 3, 2));
      this.a(lt.D, gjq.d::new);
      this.a(lt.E, glm.a::new);
      this.a(lt.F, gjr.a::new);
      this.a(lt.G, gky.c::new);
      this.a(lt.K, gkx.a::new);
      this.a(lt.L, gkp.a::new);
      this.a(lt.M, gkq.a::new);
      this.a(lt.O, gkx.b::new);
      this.a(lt.N, gjr.a::new);
      this.a(lt.P, gjq.a::new);
      this.a(lt.Q, gle.d::new);
      this.a(lt.S, gjx.b::new);
      this.a(lt.T, gky.a::new);
      this.a(lt.U, new gja.c());
      this.a(lt.X, new gja.d());
      this.a(lt.Y, new gja.a());
      this.a(lt.Z, new gja.e());
      this.a(lt.aa, gkb.a::new);
      this.a(lt.ab, gkc.a::new);
      this.a(lt.ac, gle.e::new);
      this.a(lt.au, gjt.b::new);
      this.a(lt.ad, gkf.a::new);
      this.a(lt.ae, gjn.a::new);
      this.a(lt.af, gkm.a::new);
      this.a(lt.ag, glo.a::new);
      this.a(lt.ah, gku.a::new);
      this.a(lt.ai, glq.a::new);
      this.a(lt.aj, gkl.b::new);
      this.a(lt.aN, gkv.a::new);
      this.a(lt.ak, gkz.a::new);
      this.a(lt.am, gix.a::new);
      this.a(lt.an, glh.a::new);
      this.a(lt.al, glc.b::new);
      this.a(lt.ao, gld.c::new);
      this.a(lt.ap, gla.a::new);
      this.a(lt.aq, gky.d::new);
      this.a(lt.ay, gjh::f);
      this.a(lt.az, gjh::g);
      this.a(lt.aA, gjh::h);
      this.a(lt.aB, gjh::m);
      this.a(lt.aC, gjh::n);
      this.a(lt.aG, gld.b::new);
      this.a(lt.aD, giw.a::new);
      this.a(lt.aE, gld.a::new);
      this.a(lt.aF, gld.d::new);
      this.a(lt.aH, gjh::o);
      this.a(lt.aI, gjh::p);
      this.a(lt.aJ, gjh::q);
      this.a(lt.aK, gkn.a::new);
      this.a(lt.aL, glp.a::new);
      this.a(lt.aM, gjr.b::new);
      this.a(lt.aQ, gjh::i);
      this.a(lt.aR, gjh::j);
      this.a(lt.H, gjp.a::new);
      this.a(lt.I, gjp.b::new);
      this.a(lt.J, gjp.c::new);
      this.a(lt.aO, gjh::k);
      this.a(lt.aP, gjh::l);
      this.a(lt.V, gll.a::new);
      this.a(lt.W, glj.a::new);
      this.a(lt.aS, glc.a::new);
      this.a(lt.aT, gju.b::new);
      this.a(lt.aU, gju.e::new);
      this.a(lt.aV, gju.d::new);
      this.a(lt.aW, gju.a::new);
      this.a(lt.aX, gju.c::new);
      this.a(lt.aY, gkr.a::new);
      this.a(lt.aZ, gle.c::new);
      this.a(lt.ba, gjl.a::new);
      this.a(lt.bb, glk.a::new);
      this.a(lt.bc, glk.a::new);
      this.a(lt.bd, gjt.c::new);
      this.a(lt.be, new glf.b());
      this.a(lt.bg, gky.c::new);
      this.a(lt.bh, gky.c::new);
      this.a(lt.bf, gjs.a::new);
      this.a(lt.bi, new glf.a());
   }

   private <T extends lr> void a(ls<T> $$0, gkj<T> $$1) {
      this.k.put(mb.i.a($$0), $$1);
   }

   private <T extends lr> void a(ls<T> $$0, gkj.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            glg $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
               $$10.a($$1x);
            }

            return $$10;
         });
   }

   private <T extends lr> void a(ls<T> $$0, gki.c<T> $$1) {
      gki.b $$2 = new gki.b();
      this.m.put(mb.i.b($$0), $$2);
      this.k.put(mb.i.a($$0), $$1.create($$2));
   }

   @Override
   public CompletableFuture<Void> a(auj.a $$0, aup $$1, Executor $$2, Executor $$3) {
      record a(aku a, Optional<List<aku>> b) {
      }

      CompletableFuture<List<a>> $$4 = CompletableFuture.<Map<aku, aun>>supplyAsync(() -> c.a($$1), $$2).thenCompose($$1x -> {
         List<CompletableFuture<a>> $$2x = new ArrayList<>($$1x.size());
         $$1x.forEach(($$2xx, $$3x) -> {
            aku $$4x = c.b($$2xx);
            $$2x.add(CompletableFuture.supplyAsync(() -> new a($$4x, this.a($$4x, $$3x)), $$2));
         });
         return af.d($$2x);
      });
      CompletableFuture<hfm.a> $$5 = hfm.a(this.n).a($$1, d, 0, $$2).thenCompose(hfm.a::a);
      return CompletableFuture.allOf($$5, $$4).thenCompose($$0::a).thenAcceptAsync($$2x -> {
         this.f();
         bpj $$3x = bpi.a();
         $$3x.a("upload");
         hfm.a $$4x = $$5.join();
         this.n.a($$4x);
         $$3x.b("bindSpriteSets");
         Set<aku> $$5x = new HashSet<>();
         hfr $$6 = $$4x.e();
         $$4.join().forEach($$3xx -> {
            Optional<List<aku>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<hfr> $$5xx = new ArrayList<>();

               for (aku $$6x : $$4xx.get()) {
                  hfr $$7 = $$4x.f().get($$6x);
                  if ($$7 == null) {
                     $$5x.add($$6x);
                     $$5xx.add($$6);
                  } else {
                     $$5xx.add($$7);
                  }
               }

               if ($$5xx.isEmpty()) {
                  $$5xx.add($$6);
               }

               this.m.get($$3xx.a()).a($$5xx);
            }
         });
         if (!$$5x.isEmpty()) {
            b.warn("Missing particle sprites: {}", $$5x.stream().sorted().map(aku::toString).collect(Collectors.joining(",")));
         }

         $$3x.c();
      }, $$3);
   }

   public void a() {
      this.n.f();
   }

   private Optional<List<aku>> a(aku $$0, aun $$1) {
      if (!this.m.containsKey($$0)) {
         b.debug("Redundant texture list for particle: {}", $$0);
         return Optional.empty();
      } else {
         try {
            Optional var5;
            try (Reader $$2 = $$1.e()) {
               gkh $$3 = gkh.a(ayp.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(bva $$0, lr $$1) {
      this.h.add(new gli(this.a, $$0, $$1));
   }

   public void a(bva $$0, lr $$1, int $$2) {
      this.h.add(new gli(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public gkg a(lr $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      gkg $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends lr> gkg b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      gkj<T> $$7 = (gkj<T>)this.k.get(mb.i.a($$0.a()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(gkg $$0) {
      Optional<lq> $$1 = $$0.o();
      if ($$1.isPresent()) {
         if (this.a($$1.get())) {
            this.l.add($$0);
            this.a($$1.get(), 1);
         }
      } else {
         this.l.add($$0);
      }
   }

   public void b() {
      this.g.forEach(($$0, $$1x) -> {
         bpi.a().a($$0.toString());
         this.a($$1x);
         bpi.a().c();
      });
      if (!this.h.isEmpty()) {
         List<gli> $$0 = Lists.newArrayList();

         for (gli $$1 : this.h) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.h.removeAll($$0);
      }

      gkg $$2;
      if (!this.l.isEmpty()) {
         while (($$2 = this.l.poll()) != null) {
            this.g.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<gkg> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<gkg> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            gkg $$2 = $$1.next();
            this.b($$2);
            if (!$$2.m()) {
               $$2.o().ifPresent($$0x -> this.a($$0x, -1));
               $$1.remove();
            }
         }
      }
   }

   private void a(lq $$0, int $$1) {
      this.o.addTo($$0, $$1);
   }

   private void b(gkg $$0) {
      try {
         $$0.a();
      } catch (Throwable var5) {
         o $$2 = o.a(var5, "Ticking Particle");
         p $$3 = $$2.a("Particle being ticked");
         $$3.a("Particle", $$0::toString);
         $$3.a("Particle Type", $$0.b()::toString);
         throw new z($$2);
      }
   }

   public void a(flo $$0, float $$1, gmx.a $$2) {
      for (gkk $$3 : f) {
         Queue<gkg> $$4 = this.g.get($$3);
         if ($$4 != null && !$$4.isEmpty()) {
            a($$0, $$1, $$2, $$3, $$4);
         }
      }

      Queue<gkg> $$5 = this.g.get(gkk.d);
      if ($$5 != null && !$$5.isEmpty()) {
         a($$0, $$1, $$2, $$5);
      }

      $$2.b();
   }

   private static void a(flo $$0, float $$1, gmx.a $$2, gkk $$3, Queue<gkg> $$4) {
      fgv $$5 = $$2.getBuffer(Objects.requireNonNull($$3.b()));

      for (gkg $$6 : $$4) {
         try {
            $$6.a($$5, $$0, $$1);
         } catch (Throwable var11) {
            o $$8 = o.a(var11, "Rendering Particle");
            p $$9 = $$8.a("Particle being rendered");
            $$9.a("Particle", $$6::toString);
            $$9.a("Particle Type", $$3::toString);
            throw new z($$8);
         }
      }
   }

   private static void a(flo $$0, float $$1, gmx.a $$2, Queue<gkg> $$3) {
      fgr $$4 = new fgr();

      for (gkg $$5 : $$3) {
         try {
            $$5.a($$4, $$2, $$0, $$1);
         } catch (Throwable var10) {
            o $$7 = o.a(var10, "Rendering Particle");
            p $$8 = $$7.a("Particle being rendered");
            $$8.a("Particle", $$5::toString);
            $$8.a("Particle Type", "Custom");
            throw new z($$7);
         }
      }
   }

   public void a(@Nullable ggy $$0) {
      this.a = $$0;
      this.f();
      this.h.clear();
   }

   public void a(ji $$0, dxq $$1) {
      if (!$$1.l() && $$1.D()) {
         fcr $$2 = $$1.f(this.a, $$0);
         double $$3 = 0.25;
         $$2.b(
            ($$2x, $$3x, $$4, $$5, $$6, $$7) -> {
               double $$8 = Math.min(1.0, $$5 - $$2x);
               double $$9 = Math.min(1.0, $$6 - $$3x);
               double $$10 = Math.min(1.0, $$7 - $$4);
               int $$11 = Math.max(2, ayz.c($$8 / 0.25));
               int $$12 = Math.max(2, ayz.c($$9 / 0.25));
               int $$13 = Math.max(2, ayz.c($$10 / 0.25));

               for (int $$14 = 0; $$14 < $$11; $$14++) {
                  for (int $$15 = 0; $$15 < $$12; $$15++) {
                     for (int $$16 = 0; $$16 < $$13; $$16++) {
                        double $$17 = ((double)$$14 + 0.5) / (double)$$11;
                        double $$18 = ((double)$$15 + 0.5) / (double)$$12;
                        double $$19 = ((double)$$16 + 0.5) / (double)$$13;
                        double $$20 = $$17 * $$8 + $$2x;
                        double $$21 = $$18 * $$9 + $$3x;
                        double $$22 = $$19 * $$10 + $$4;
                        this.a(
                           new glf(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void a(ji $$0, jn $$1) {
      dxq $$2 = this.a.a_($$0);
      if ($$2.o() != dqp.a && $$2.D()) {
         int $$3 = $$0.u();
         int $$4 = $$0.v();
         int $$5 = $$0.w();
         float $$6 = 0.1F;
         fbs $$7 = $$2.f(this.a, $$0).a();
         double $$8 = (double)$$3 + this.j.j() * ($$7.d - $$7.a - 0.2F) + 0.1F + $$7.a;
         double $$9 = (double)$$4 + this.j.j() * ($$7.e - $$7.b - 0.2F) + 0.1F + $$7.b;
         double $$10 = (double)$$5 + this.j.j() * ($$7.f - $$7.c - 0.2F) + 0.1F + $$7.c;
         if ($$1 == jn.a) {
            $$9 = (double)$$4 + $$7.b - 0.1F;
         }

         if ($$1 == jn.b) {
            $$9 = (double)$$4 + $$7.e + 0.1F;
         }

         if ($$1 == jn.c) {
            $$10 = (double)$$5 + $$7.c - 0.1F;
         }

         if ($$1 == jn.d) {
            $$10 = (double)$$5 + $$7.f + 0.1F;
         }

         if ($$1 == jn.e) {
            $$8 = (double)$$3 + $$7.a - 0.1F;
         }

         if ($$1 == jn.f) {
            $$8 = (double)$$3 + $$7.d + 0.1F;
         }

         this.a(new glf(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
      }
   }

   public String d() {
      return String.valueOf(this.g.values().stream().mapToInt(Collection::size).sum());
   }

   private boolean a(lq $$0) {
      return this.o.getInt($$0) < $$0.a();
   }

   private void f() {
      this.g.clear();
      this.l.clear();
      this.h.clear();
      this.o.clear();
   }

   static class b implements glb {
      private List<hfr> a;

      @Override
      public hfr a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public hfr a(azh $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<hfr> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends lr> {
      gkj<T> create(glb var1);
   }
}
