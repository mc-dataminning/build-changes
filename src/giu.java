import com.google.common.collect.EvictingQueue;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
import com.mojang.blaze3d.systems.RenderSystem;
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
import java.util.Optional;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class giu implements avp {
   private static final Logger b = LogUtils.getLogger();
   private static final als c = als.a("particles");
   private static final alz d = alz.b("particles");
   private static final int e = 16384;
   private static final List<giw> f = ImmutableList.of(giw.a, giw.b, giw.c, giw.d);
   protected gfk a;
   private final Map<giw, Queue<gis>> g = Maps.newIdentityHashMap();
   private final Queue<gju> h = Queues.newArrayDeque();
   private final hbm i;
   private final bam j = bam.a();
   private final Int2ObjectMap<giv<?>> k = new Int2ObjectOpenHashMap();
   private final Queue<gis> l = Queues.newArrayDeque();
   private final Map<alz, giu.b> m = Maps.newHashMap();
   private final hbk n;
   private final Object2IntOpenHashMap<lp> o = new Object2IntOpenHashMap();

   public giu(gfk $$0, hbm $$1) {
      this.n = new hbk(hbk.e);
      $$1.a(this.n.h(), this.n);
      this.a = $$0;
      this.i = $$1;
      this.e();
   }

   private void e() {
      this.a(ls.a, gij.a::new);
      this.a(ls.c, new ghl.a());
      this.a(ls.b, new gjr.c());
      this.a(ls.d, gho.a::new);
      this.a(ls.ar, ghn.a::new);
      this.a(ls.ap, ghp.a::new);
      this.a(ls.au, ghq.a::new);
      this.a(ls.av, ghq.b::new);
      this.a(ls.e, gix.a::new);
      this.a(ls.P, gjq.a::new);
      this.a(ls.f, ghs.c::new);
      this.a(ls.aq, gjz.a::new);
      this.a(ls.g, ghs.a::new);
      this.a(ls.h, ght.a::new);
      this.a(ls.at, gjq.b::new);
      this.a(ls.i, ghu::c);
      this.a(ls.j, ghu::d);
      this.a(ls.k, ghu::e);
      this.a(ls.l, ghu::a);
      this.a(ls.m, ghu::b);
      this.a(ls.n, ghw.a::new);
      this.a(ls.o, ghv.a::new);
      this.a(ls.p, gjk.c::new);
      this.a(ls.q, new gip.a());
      this.a(ls.r, ghs.b::new);
      this.a(ls.s, gif.a::new);
      this.a(ls.t, ghz.a::new);
      this.a(ls.u, gjk.b::new);
      this.a(ls.v, new gil.a());
      this.a(ls.w, gik.a::new);
      this.a(ls.B, gji.a::new);
      this.a(ls.C, gib.a::new);
      this.a(ls.x, gih.a::new);
      this.a(ls.y, gih.b::new);
      this.a(ls.z, new gii.a(3.0, 7, 0));
      this.a(ls.A, new gii.a(1.0, 3, 2));
      this.a(ls.D, gic.d::new);
      this.a(ls.E, gjy.a::new);
      this.a(ls.F, gid.a::new);
      this.a(ls.G, gjk.c::new);
      this.a(ls.I, gjj.a::new);
      this.a(ls.J, gjb.a::new);
      this.a(ls.K, gjc.a::new);
      this.a(ls.M, gjj.b::new);
      this.a(ls.L, gid.a::new);
      this.a(ls.N, gic.a::new);
      this.a(ls.O, gjq.d::new);
      this.a(ls.Q, gij.b::new);
      this.a(ls.R, gjk.a::new);
      this.a(ls.S, new ghm.b());
      this.a(ls.V, new ghm.c());
      this.a(ls.W, new ghm.a());
      this.a(ls.X, new ghm.d());
      this.a(ls.Y, gin.a::new);
      this.a(ls.Z, gio.a::new);
      this.a(ls.aa, gjq.e::new);
      this.a(ls.as, gif.b::new);
      this.a(ls.ab, gir.a::new);
      this.a(ls.ac, gia.a::new);
      this.a(ls.ad, giy.a::new);
      this.a(ls.ae, gka.a::new);
      this.a(ls.af, gjg.a::new);
      this.a(ls.ag, gkc.a::new);
      this.a(ls.ah, gix.b::new);
      this.a(ls.aL, gjh.a::new);
      this.a(ls.ai, gjl.a::new);
      this.a(ls.ak, ghj.a::new);
      this.a(ls.al, gjt.a::new);
      this.a(ls.aj, gjo.b::new);
      this.a(ls.am, gjp.c::new);
      this.a(ls.an, gjm.a::new);
      this.a(ls.ao, gjk.d::new);
      this.a(ls.aw, ghu::f);
      this.a(ls.ax, ghu::g);
      this.a(ls.ay, ghu::h);
      this.a(ls.az, ghu::m);
      this.a(ls.aA, ghu::n);
      this.a(ls.aE, gjp.b::new);
      this.a(ls.aB, ghi.a::new);
      this.a(ls.aC, gjp.a::new);
      this.a(ls.aD, gjp.d::new);
      this.a(ls.aF, ghu::o);
      this.a(ls.aG, ghu::p);
      this.a(ls.aH, ghu::q);
      this.a(ls.aI, giz.a::new);
      this.a(ls.aJ, gkb.a::new);
      this.a(ls.aK, gid.b::new);
      this.a(ls.aO, ghu::i);
      this.a(ls.aP, ghu::j);
      this.a(ls.H, $$0 -> ($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> new ghr($$2, $$3, $$4, $$5, $$0));
      this.a(ls.aM, ghu::k);
      this.a(ls.aN, ghu::l);
      this.a(ls.T, gjx.a::new);
      this.a(ls.U, gjv.a::new);
      this.a(ls.aQ, gjo.a::new);
      this.a(ls.aR, gig.b::new);
      this.a(ls.aS, gig.e::new);
      this.a(ls.aT, gig.d::new);
      this.a(ls.aU, gig.a::new);
      this.a(ls.aV, gig.c::new);
      this.a(ls.aW, gjd.a::new);
      this.a(ls.aX, gjq.c::new);
      this.a(ls.aY, ghy.a::new);
      this.a(ls.aZ, gjw.a::new);
      this.a(ls.ba, gjw.a::new);
      this.a(ls.bb, gif.c::new);
      this.a(ls.bc, new gjr.b());
      this.a(ls.be, gjk.c::new);
      this.a(ls.bf, gjk.c::new);
      this.a(ls.bd, gie.a::new);
      this.a(ls.bg, new gjr.a());
   }

   private <T extends lq> void a(lr<T> $$0, giv<T> $$1) {
      this.k.put(ma.i.a($$0), $$1);
   }

   private <T extends lq> void a(lr<T> $$0, giv.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            gjs $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
               $$10.a($$1x);
            }

            return $$10;
         });
   }

   private <T extends lq> void a(lr<T> $$0, giu.c<T> $$1) {
      giu.b $$2 = new giu.b();
      this.m.put(ma.i.b($$0), $$2);
      this.k.put(ma.i.a($$0), $$1.create($$2));
   }

   @Override
   public CompletableFuture<Void> a(avp.a $$0, avv $$1, Executor $$2, Executor $$3) {
      record a(alz a, Optional<List<alz>> b) {
      }

      CompletableFuture<List<a>> $$4 = CompletableFuture.<Map<alz, avt>>supplyAsync(() -> c.a($$1), $$2).thenCompose($$1x -> {
         List<CompletableFuture<a>> $$2x = new ArrayList<>($$1x.size());
         $$1x.forEach(($$2xx, $$3x) -> {
            alz $$4x = c.b($$2xx);
            $$2x.add(CompletableFuture.supplyAsync(() -> new a($$4x, this.a($$4x, $$3x)), $$2));
         });
         return ae.d($$2x);
      });
      CompletableFuture<hbg.a> $$5 = hbg.a(this.n).a($$1, d, 0, $$2).thenCompose(hbg.a::a);
      return CompletableFuture.allOf($$5, $$4).thenCompose($$0::a).thenAcceptAsync($$2x -> {
         this.f();
         bpt $$3x = bps.a();
         $$3x.a("upload");
         hbg.a $$4x = $$5.join();
         this.n.a($$4x);
         $$3x.b("bindSpriteSets");
         Set<alz> $$5x = new HashSet<>();
         hbl $$6 = $$4x.e();
         $$4.join().forEach($$3xx -> {
            Optional<List<alz>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<hbl> $$5xx = new ArrayList<>();

               for (alz $$6x : $$4xx.get()) {
                  hbl $$7 = $$4x.f().get($$6x);
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
            b.warn("Missing particle sprites: {}", $$5x.stream().sorted().map(alz::toString).collect(Collectors.joining(",")));
         }

         $$3x.c();
      }, $$3);
   }

   public void a() {
      this.n.g();
   }

   private Optional<List<alz>> a(alz $$0, avt $$1) {
      if (!this.m.containsKey($$0)) {
         b.debug("Redundant texture list for particle: {}", $$0);
         return Optional.empty();
      } else {
         try {
            Optional var5;
            try (Reader $$2 = $$1.e()) {
               git $$3 = git.a(azu.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(bvk $$0, lq $$1) {
      this.h.add(new gju(this.a, $$0, $$1));
   }

   public void a(bvk $$0, lq $$1, int $$2) {
      this.h.add(new gju(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public gis a(lq $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      gis $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends lq> gis b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      giv<T> $$7 = (giv<T>)this.k.get(ma.i.a($$0.a()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(gis $$0) {
      Optional<lp> $$1 = $$0.o();
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
         bps.a().a($$0.toString());
         this.a($$1x);
         bps.a().c();
      });
      if (!this.h.isEmpty()) {
         List<gju> $$0 = Lists.newArrayList();

         for (gju $$1 : this.h) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.h.removeAll($$0);
      }

      gis $$2;
      if (!this.l.isEmpty()) {
         while (($$2 = this.l.poll()) != null) {
            this.g.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<gis> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<gis> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            gis $$2 = $$1.next();
            this.b($$2);
            if (!$$2.m()) {
               $$2.o().ifPresent($$0x -> this.a($$0x, -1));
               $$1.remove();
            }
         }
      }
   }

   private void a(lp $$0, int $$1) {
      this.o.addTo($$0, $$1);
   }

   private void b(gis $$0) {
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

   public void a(glj $$0, flp $$1, float $$2) {
      $$0.c();
      RenderSystem.enableDepthTest();

      for (giw $$3 : f) {
         Queue<gis> $$4 = this.g.get($$3);
         if ($$4 != null && !$$4.isEmpty()) {
            fgu $$5 = fgu.b();
            fgn $$6 = $$3.a($$5, this.i);
            if ($$6 != null) {
               for (gis $$7 : $$4) {
                  try {
                     $$7.a($$6, $$1, $$2);
                  } catch (Throwable var14) {
                     o $$9 = o.a(var14, "Rendering Particle");
                     p $$10 = $$9.a("Particle being rendered");
                     $$10.a("Particle", $$7::toString);
                     $$10.a("Particle Type", $$3::toString);
                     throw new z($$9);
                  }
               }

               fgr $$11 = $$6.a();
               if ($$11 != null) {
                  fgo.a($$11);
               }
            }
         }
      }

      RenderSystem.depthMask(true);
      RenderSystem.disableBlend();
      $$0.b();
   }

   public void a(@Nullable gfk $$0) {
      this.a = $$0;
      this.f();
      this.h.clear();
   }

   public void a(jh $$0, dxv $$1) {
      if (!$$1.l() && $$1.D()) {
         fcs $$2 = $$1.f(this.a, $$0);
         double $$3 = 0.25;
         $$2.b(
            ($$2x, $$3x, $$4, $$5, $$6, $$7) -> {
               double $$8 = Math.min(1.0, $$5 - $$2x);
               double $$9 = Math.min(1.0, $$6 - $$3x);
               double $$10 = Math.min(1.0, $$7 - $$4);
               int $$11 = Math.max(2, bae.c($$8 / 0.25));
               int $$12 = Math.max(2, bae.c($$9 / 0.25));
               int $$13 = Math.max(2, bae.c($$10 / 0.25));

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
                           new gjr(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void a(jh $$0, jm $$1) {
      dxv $$2 = this.a.a_($$0);
      if ($$2.o() != dqv.a && $$2.D()) {
         int $$3 = $$0.u();
         int $$4 = $$0.v();
         int $$5 = $$0.w();
         float $$6 = 0.1F;
         fbt $$7 = $$2.f(this.a, $$0).a();
         double $$8 = (double)$$3 + this.j.j() * ($$7.d - $$7.a - 0.2F) + 0.1F + $$7.a;
         double $$9 = (double)$$4 + this.j.j() * ($$7.e - $$7.b - 0.2F) + 0.1F + $$7.b;
         double $$10 = (double)$$5 + this.j.j() * ($$7.f - $$7.c - 0.2F) + 0.1F + $$7.c;
         if ($$1 == jm.a) {
            $$9 = (double)$$4 + $$7.b - 0.1F;
         }

         if ($$1 == jm.b) {
            $$9 = (double)$$4 + $$7.e + 0.1F;
         }

         if ($$1 == jm.c) {
            $$10 = (double)$$5 + $$7.c - 0.1F;
         }

         if ($$1 == jm.d) {
            $$10 = (double)$$5 + $$7.f + 0.1F;
         }

         if ($$1 == jm.e) {
            $$8 = (double)$$3 + $$7.a - 0.1F;
         }

         if ($$1 == jm.f) {
            $$8 = (double)$$3 + $$7.d + 0.1F;
         }

         this.a(new gjr(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
      }
   }

   public String d() {
      return String.valueOf(this.g.values().stream().mapToInt(Collection::size).sum());
   }

   private boolean a(lp $$0) {
      return this.o.getInt($$0) < $$0.a();
   }

   private void f() {
      this.g.clear();
      this.l.clear();
      this.h.clear();
      this.o.clear();
   }

   static class b implements gjn {
      private List<hbl> a;

      @Override
      public hbl a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public hbl a(bam $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<hbl> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends lq> {
      giv<T> create(gjn var1);
   }
}
