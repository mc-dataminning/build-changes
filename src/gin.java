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

public class gin implements avp {
   private static final Logger b = LogUtils.getLogger();
   private static final als c = als.a("particles");
   private static final alz d = alz.b("particles");
   private static final int e = 16384;
   private static final List<gip> f = ImmutableList.of(gip.a, gip.b, gip.c, gip.d);
   protected gfd a;
   private final Map<gip, Queue<gil>> g = Maps.newIdentityHashMap();
   private final Queue<gjn> h = Queues.newArrayDeque();
   private final hbf i;
   private final bam j = bam.a();
   private final Int2ObjectMap<gio<?>> k = new Int2ObjectOpenHashMap();
   private final Queue<gil> l = Queues.newArrayDeque();
   private final Map<alz, gin.b> m = Maps.newHashMap();
   private final hbd n;
   private final Object2IntOpenHashMap<lp> o = new Object2IntOpenHashMap();

   public gin(gfd $$0, hbf $$1) {
      this.n = new hbd(hbd.e);
      $$1.a(this.n.h(), this.n);
      this.a = $$0;
      this.i = $$1;
      this.e();
   }

   private void e() {
      this.a(ls.a, gic.a::new);
      this.a(ls.c, new ghe.a());
      this.a(ls.b, new gjk.c());
      this.a(ls.d, ghh.a::new);
      this.a(ls.ar, ghg.a::new);
      this.a(ls.ap, ghi.a::new);
      this.a(ls.au, ghj.a::new);
      this.a(ls.av, ghj.b::new);
      this.a(ls.e, giq.a::new);
      this.a(ls.P, gjj.a::new);
      this.a(ls.f, ghl.c::new);
      this.a(ls.aq, gjs.a::new);
      this.a(ls.g, ghl.a::new);
      this.a(ls.h, ghm.a::new);
      this.a(ls.at, gjj.b::new);
      this.a(ls.i, ghn::c);
      this.a(ls.j, ghn::d);
      this.a(ls.k, ghn::e);
      this.a(ls.l, ghn::a);
      this.a(ls.m, ghn::b);
      this.a(ls.n, ghp.a::new);
      this.a(ls.o, gho.a::new);
      this.a(ls.p, gjd.c::new);
      this.a(ls.q, new gii.a());
      this.a(ls.r, ghl.b::new);
      this.a(ls.s, ghy.a::new);
      this.a(ls.t, ghs.a::new);
      this.a(ls.u, gjd.b::new);
      this.a(ls.v, new gie.a());
      this.a(ls.w, gid.a::new);
      this.a(ls.B, gjb.a::new);
      this.a(ls.C, ghu.a::new);
      this.a(ls.x, gia.a::new);
      this.a(ls.y, gia.b::new);
      this.a(ls.z, new gib.a(3.0, 7, 0));
      this.a(ls.A, new gib.a(1.0, 3, 2));
      this.a(ls.D, ghv.d::new);
      this.a(ls.E, gjr.a::new);
      this.a(ls.F, ghw.a::new);
      this.a(ls.G, gjd.c::new);
      this.a(ls.I, gjc.a::new);
      this.a(ls.J, giu.a::new);
      this.a(ls.K, giv.a::new);
      this.a(ls.M, gjc.b::new);
      this.a(ls.L, ghw.a::new);
      this.a(ls.N, ghv.a::new);
      this.a(ls.O, gjj.d::new);
      this.a(ls.Q, gic.b::new);
      this.a(ls.R, gjd.a::new);
      this.a(ls.S, new ghf.b());
      this.a(ls.V, new ghf.c());
      this.a(ls.W, new ghf.a());
      this.a(ls.X, new ghf.d());
      this.a(ls.Y, gig.a::new);
      this.a(ls.Z, gih.a::new);
      this.a(ls.aa, gjj.e::new);
      this.a(ls.as, ghy.b::new);
      this.a(ls.ab, gik.a::new);
      this.a(ls.ac, ght.a::new);
      this.a(ls.ad, gir.a::new);
      this.a(ls.ae, gjt.a::new);
      this.a(ls.af, giz.a::new);
      this.a(ls.ag, gjv.a::new);
      this.a(ls.ah, giq.b::new);
      this.a(ls.aL, gja.a::new);
      this.a(ls.ai, gje.a::new);
      this.a(ls.ak, ghc.a::new);
      this.a(ls.al, gjm.a::new);
      this.a(ls.aj, gjh.b::new);
      this.a(ls.am, gji.c::new);
      this.a(ls.an, gjf.a::new);
      this.a(ls.ao, gjd.d::new);
      this.a(ls.aw, ghn::f);
      this.a(ls.ax, ghn::g);
      this.a(ls.ay, ghn::h);
      this.a(ls.az, ghn::m);
      this.a(ls.aA, ghn::n);
      this.a(ls.aE, gji.b::new);
      this.a(ls.aB, ghb.a::new);
      this.a(ls.aC, gji.a::new);
      this.a(ls.aD, gji.d::new);
      this.a(ls.aF, ghn::o);
      this.a(ls.aG, ghn::p);
      this.a(ls.aH, ghn::q);
      this.a(ls.aI, gis.a::new);
      this.a(ls.aJ, gju.a::new);
      this.a(ls.aK, ghw.b::new);
      this.a(ls.aO, ghn::i);
      this.a(ls.aP, ghn::j);
      this.a(ls.H, $$0 -> ($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> new ghk($$2, $$3, $$4, $$5, $$0));
      this.a(ls.aM, ghn::k);
      this.a(ls.aN, ghn::l);
      this.a(ls.T, gjq.a::new);
      this.a(ls.U, gjo.a::new);
      this.a(ls.aQ, gjh.a::new);
      this.a(ls.aR, ghz.b::new);
      this.a(ls.aS, ghz.e::new);
      this.a(ls.aT, ghz.d::new);
      this.a(ls.aU, ghz.a::new);
      this.a(ls.aV, ghz.c::new);
      this.a(ls.aW, giw.a::new);
      this.a(ls.aX, gjj.c::new);
      this.a(ls.aY, ghr.a::new);
      this.a(ls.aZ, gjp.a::new);
      this.a(ls.ba, gjp.a::new);
      this.a(ls.bb, ghy.c::new);
      this.a(ls.bc, new gjk.b());
      this.a(ls.be, gjd.c::new);
      this.a(ls.bf, gjd.c::new);
      this.a(ls.bd, ghx.a::new);
      this.a(ls.bg, new gjk.a());
   }

   private <T extends lq> void a(lr<T> $$0, gio<T> $$1) {
      this.k.put(ma.i.a($$0), $$1);
   }

   private <T extends lq> void a(lr<T> $$0, gio.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            gjl $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
               $$10.a($$1x);
            }

            return $$10;
         });
   }

   private <T extends lq> void a(lr<T> $$0, gin.c<T> $$1) {
      gin.b $$2 = new gin.b();
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
      CompletableFuture<haz.a> $$5 = haz.a(this.n).a($$1, d, 0, $$2).thenCompose(haz.a::a);
      return CompletableFuture.allOf($$5, $$4).thenCompose($$0::a).thenAcceptAsync($$2x -> {
         this.f();
         bpo $$3x = bpn.a();
         $$3x.a("upload");
         haz.a $$4x = $$5.join();
         this.n.a($$4x);
         $$3x.b("bindSpriteSets");
         Set<alz> $$5x = new HashSet<>();
         hbe $$6 = $$4x.e();
         $$4.join().forEach($$3xx -> {
            Optional<List<alz>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<hbe> $$5xx = new ArrayList<>();

               for (alz $$6x : $$4xx.get()) {
                  hbe $$7 = $$4x.f().get($$6x);
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
               gim $$3 = gim.a(azu.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(bvf $$0, lq $$1) {
      this.h.add(new gjn(this.a, $$0, $$1));
   }

   public void a(bvf $$0, lq $$1, int $$2) {
      this.h.add(new gjn(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public gil a(lq $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      gil $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends lq> gil b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      gio<T> $$7 = (gio<T>)this.k.get(ma.i.a($$0.a()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(gil $$0) {
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
         bpn.a().a($$0.toString());
         this.a($$1x);
         bpn.a().c();
      });
      if (!this.h.isEmpty()) {
         List<gjn> $$0 = Lists.newArrayList();

         for (gjn $$1 : this.h) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.h.removeAll($$0);
      }

      gil $$2;
      if (!this.l.isEmpty()) {
         while (($$2 = this.l.poll()) != null) {
            this.g.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<gil> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<gil> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            gil $$2 = $$1.next();
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

   private void b(gil $$0) {
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

   public void a(glc $$0, fli $$1, float $$2) {
      $$0.c();
      RenderSystem.enableDepthTest();

      for (gip $$3 : f) {
         Queue<gil> $$4 = this.g.get($$3);
         if ($$4 != null && !$$4.isEmpty()) {
            fgn $$5 = fgn.b();
            fgg $$6 = $$3.a($$5, this.i);
            if ($$6 != null) {
               for (gil $$7 : $$4) {
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

               fgk $$11 = $$6.a();
               if ($$11 != null) {
                  fgh.a($$11);
               }
            }
         }
      }

      RenderSystem.depthMask(true);
      RenderSystem.disableBlend();
      $$0.b();
   }

   public void a(@Nullable gfd $$0) {
      this.a = $$0;
      this.f();
      this.h.clear();
   }

   public void a(jh $$0, dxn $$1) {
      if (!$$1.l() && $$1.D()) {
         fcm $$2 = $$1.f(this.a, $$0);
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
                           new gjk(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void a(jh $$0, jm $$1) {
      dxn $$2 = this.a.a_($$0);
      if ($$2.o() != dqn.a && $$2.D()) {
         int $$3 = $$0.u();
         int $$4 = $$0.v();
         int $$5 = $$0.w();
         float $$6 = 0.1F;
         fbn $$7 = $$2.f(this.a, $$0).a();
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

         this.a(new gjk(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
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

   static class b implements gjg {
      private List<hbe> a;

      @Override
      public hbe a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public hbe a(bam $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<hbe> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends lq> {
      gio<T> create(gjg var1);
   }
}
