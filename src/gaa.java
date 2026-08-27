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

public class gaa implements atq {
   private static final Logger b = LogUtils.getLogger();
   private static final akf c = akf.a("particles");
   private static final akm d = new akm("particles");
   private static final int e = 16384;
   private static final List<gac> f = ImmutableList.of(gac.a, gac.b, gac.d, gac.c, gac.e);
   protected fwr a;
   private final Map<gac, Queue<fzy>> g = Maps.newIdentityHashMap();
   private final Queue<gba> h = Queues.newArrayDeque();
   private final gnw i;
   private final ayk j = ayk.a();
   private final Int2ObjectMap<gab<?>> k = new Int2ObjectOpenHashMap();
   private final Queue<fzy> l = Queues.newArrayDeque();
   private final Map<akm, gaa.b> m = Maps.newHashMap();
   private final gnu n;
   private final Object2IntOpenHashMap<kv> o = new Object2IntOpenHashMap();

   public gaa(fwr $$0, gnw $$1) {
      this.n = new gnu(gnu.f);
      $$1.a(this.n.g(), this.n);
      this.a = $$0;
      this.i = $$1;
      this.e();
   }

   private void e() {
      this.a(ky.a, fzp.a::new);
      this.a(ky.c, new fyr.a());
      this.a(ky.b, new gax.b());
      this.a(ky.d, fyu.a::new);
      this.a(ky.aq, fyt.a::new);
      this.a(ky.ao, fyv.a::new);
      this.a(ky.at, fyw.a::new);
      this.a(ky.au, fyw.b::new);
      this.a(ky.e, gad.a::new);
      this.a(ky.P, gaw.a::new);
      this.a(ky.f, fyy.c::new);
      this.a(ky.ap, gbe.a::new);
      this.a(ky.g, fyy.a::new);
      this.a(ky.h, fyz.a::new);
      this.a(ky.as, gaw.b::new);
      this.a(ky.i, fza::c);
      this.a(ky.j, fza::d);
      this.a(ky.k, fza::e);
      this.a(ky.l, fza::a);
      this.a(ky.m, fza::b);
      this.a(ky.n, fzc.a::new);
      this.a(ky.o, fzb.a::new);
      this.a(ky.p, gaq.c::new);
      this.a(ky.q, new fzv.a());
      this.a(ky.r, fyy.b::new);
      this.a(ky.s, fzl.a::new);
      this.a(ky.t, fzf.a::new);
      this.a(ky.u, gaq.b::new);
      this.a(ky.v, new fzr.a());
      this.a(ky.w, fzq.a::new);
      this.a(ky.B, gao.a::new);
      this.a(ky.C, fzh.a::new);
      this.a(ky.x, fzn.a::new);
      this.a(ky.y, fzn.b::new);
      this.a(ky.z, new fzo.a(3.0, 7, 0));
      this.a(ky.A, new fzo.a(1.0, 3, 2));
      this.a(ky.D, fzi.d::new);
      this.a(ky.E, gbd.a::new);
      this.a(ky.F, fzj.a::new);
      this.a(ky.G, gaq.c::new);
      this.a(ky.I, gap.a::new);
      this.a(ky.J, gah.a::new);
      this.a(ky.K, gai.a::new);
      this.a(ky.M, gap.b::new);
      this.a(ky.L, fzj.a::new);
      this.a(ky.N, fzi.a::new);
      this.a(ky.O, gaw.d::new);
      this.a(ky.Q, fzp.b::new);
      this.a(ky.R, gaq.a::new);
      this.a(ky.S, new fys.b());
      this.a(ky.U, new fys.c());
      this.a(ky.V, new fys.a());
      this.a(ky.W, new fys.d());
      this.a(ky.X, fzt.a::new);
      this.a(ky.Y, fzu.a::new);
      this.a(ky.Z, gaw.e::new);
      this.a(ky.ar, fzl.b::new);
      this.a(ky.aa, fzx.a::new);
      this.a(ky.ab, fzg.a::new);
      this.a(ky.ac, gae.a::new);
      this.a(ky.ad, gbf.a::new);
      this.a(ky.ae, gam.a::new);
      this.a(ky.af, gbh.a::new);
      this.a(ky.ag, gad.b::new);
      this.a(ky.aK, gan.a::new);
      this.a(ky.ah, gar.a::new);
      this.a(ky.aj, fyp.a::new);
      this.a(ky.ak, gaz.a::new);
      this.a(ky.ai, gau.b::new);
      this.a(ky.al, gav.c::new);
      this.a(ky.am, gas.a::new);
      this.a(ky.an, gaq.d::new);
      this.a(ky.av, fza::f);
      this.a(ky.aw, fza::g);
      this.a(ky.ax, fza::h);
      this.a(ky.ay, fza::m);
      this.a(ky.az, fza::n);
      this.a(ky.aD, gav.b::new);
      this.a(ky.aA, fyo.a::new);
      this.a(ky.aB, gav.a::new);
      this.a(ky.aC, gav.d::new);
      this.a(ky.aE, fza::o);
      this.a(ky.aF, fza::p);
      this.a(ky.aG, fza::q);
      this.a(ky.aH, gaf.a::new);
      this.a(ky.aI, gbg.a::new);
      this.a(ky.aJ, fzj.b::new);
      this.a(ky.aN, fza::i);
      this.a(ky.aO, fza::j);
      this.a(ky.H, $$0 -> ($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> new fyx($$2, $$3, $$4, $$5, $$0));
      this.a(ky.aL, fza::k);
      this.a(ky.aM, fza::l);
      this.a(ky.T, gbc.a::new);
      this.a(ky.aP, gau.a::new);
      this.a(ky.aQ, fzm.b::new);
      this.a(ky.aR, fzm.e::new);
      this.a(ky.aS, fzm.d::new);
      this.a(ky.aT, fzm.a::new);
      this.a(ky.aU, fzm.c::new);
      this.a(ky.aV, gaj.a::new);
      this.a(ky.aW, gaw.c::new);
      this.a(ky.aX, fze.a::new);
      this.a(ky.aY, gbb.a::new);
      this.a(ky.aZ, gbb.a::new);
      this.a(ky.ba, fzl.c::new);
      this.a(ky.bb, new gax.a());
      this.a(ky.bd, gaq.c::new);
      this.a(ky.be, gaq.c::new);
      this.a(ky.bc, fzk.a::new);
   }

   private <T extends kw> void a(kx<T> $$0, gab<T> $$1) {
      this.k.put(le.j.a($$0), $$1);
   }

   private <T extends kw> void a(kx<T> $$0, gab.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            gay $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
               $$10.a($$1x);
            }

            return $$10;
         });
   }

   private <T extends kw> void a(kx<T> $$0, gaa.c<T> $$1) {
      gaa.b $$2 = new gaa.b();
      this.m.put(le.j.b($$0), $$2);
      this.k.put(le.j.a($$0), $$1.create($$2));
   }

   @Override
   public CompletableFuture<Void> a(atq.a $$0, atw $$1, bmi $$2, bmi $$3, Executor $$4, Executor $$5) {
      record a(akm a, Optional<List<akm>> b) {
      }

      CompletableFuture<List<a>> $$6 = CompletableFuture.<Map<akm, atu>>supplyAsync(() -> c.a($$1), $$4).thenCompose($$1x -> {
         List<CompletableFuture<a>> $$2x = new ArrayList<>($$1x.size());
         $$1x.forEach(($$2xx, $$3x) -> {
            akm $$4x = c.b($$2xx);
            $$2x.add(CompletableFuture.supplyAsync(() -> new a($$4x, this.a($$4x, $$3x)), $$4));
         });
         return ac.d($$2x);
      });
      CompletableFuture<gnq.a> $$7 = gnq.a(this.n).a($$1, d, 0, $$4).thenCompose(gnq.a::a);
      return CompletableFuture.allOf($$7, $$6).thenCompose($$0::a).thenAcceptAsync($$3x -> {
         this.f();
         $$3.a();
         $$3.a("upload");
         gnq.a $$4x = $$7.join();
         this.n.a($$4x);
         $$3.b("bindSpriteSets");
         Set<akm> $$5x = new HashSet<>();
         gnv $$6x = $$4x.e();
         $$6.join().forEach($$3xx -> {
            Optional<List<akm>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<gnv> $$5xx = new ArrayList<>();

               for (akm $$6xx : $$4xx.get()) {
                  gnv $$7x = $$4x.f().get($$6xx);
                  if ($$7x == null) {
                     $$5x.add($$6xx);
                     $$5xx.add($$6x);
                  } else {
                     $$5xx.add($$7x);
                  }
               }

               if ($$5xx.isEmpty()) {
                  $$5xx.add($$6x);
               }

               this.m.get($$3xx.a()).a($$5xx);
            }
         });
         if (!$$5x.isEmpty()) {
            b.warn("Missing particle sprites: {}", $$5x.stream().sorted().map(akm::toString).collect(Collectors.joining(",")));
         }

         $$3.c();
         $$3.b();
      }, $$5);
   }

   public void a() {
      this.n.f();
   }

   private Optional<List<akm>> a(akm $$0, atu $$1) {
      if (!this.m.containsKey($$0)) {
         b.debug("Redundant texture list for particle: {}", $$0);
         return Optional.empty();
      } else {
         try {
            Optional var5;
            try (Reader $$2 = $$1.e()) {
               fzz $$3 = fzz.a(axu.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(bru $$0, kw $$1) {
      this.h.add(new gba(this.a, $$0, $$1));
   }

   public void a(bru $$0, kw $$1, int $$2) {
      this.h.add(new gba(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public fzy a(kw $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      fzy $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends kw> fzy b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      gab<T> $$7 = (gab<T>)this.k.get(le.j.a($$0.a()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(fzy $$0) {
      Optional<kv> $$1 = $$0.o();
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
         this.a.af().a($$0.toString());
         this.a($$1x);
         this.a.af().c();
      });
      if (!this.h.isEmpty()) {
         List<gba> $$0 = Lists.newArrayList();

         for (gba $$1 : this.h) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.h.removeAll($$0);
      }

      fzy $$2;
      if (!this.l.isEmpty()) {
         while (($$2 = this.l.poll()) != null) {
            this.g.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<fzy> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<fzy> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            fzy $$2 = $$1.next();
            this.b($$2);
            if (!$$2.m()) {
               $$2.o().ifPresent($$0x -> this.a($$0x, -1));
               $$1.remove();
            }
         }
      }
   }

   private void a(kv $$0, int $$1) {
      this.o.addTo($$0, $$1);
   }

   private void b(fzy $$0) {
      try {
         $$0.a();
      } catch (Throwable var5) {
         o $$2 = o.a(var5, "Ticking Particle");
         p $$3 = $$2.a("Particle being ticked");
         $$3.a("Particle", $$0::toString);
         $$3.a("Particle Type", $$0.b()::toString);
         throw new y($$2);
      }
   }

   public void a(gcj $$0, fdk $$1, float $$2) {
      $$0.c();
      RenderSystem.enableDepthTest();

      for (gac $$3 : f) {
         Iterable<fzy> $$4 = this.g.get($$3);
         if ($$4 != null) {
            RenderSystem.setShader(gcd::u);
            eyu $$5 = eyu.b();
            eyn $$6 = $$5.d();
            $$3.a($$6, this.i);

            for (fzy $$7 : $$4) {
               try {
                  $$7.a($$6, $$1, $$2);
               } catch (Throwable var14) {
                  o $$9 = o.a(var14, "Rendering Particle");
                  p $$10 = $$9.a("Particle being rendered");
                  $$10.a("Particle", $$7::toString);
                  $$10.a("Particle Type", $$3::toString);
                  throw new y($$9);
               }
            }

            $$3.a($$5);
         }
      }

      RenderSystem.depthMask(true);
      RenderSystem.disableBlend();
      $$0.b();
   }

   public void a(@Nullable fwr $$0) {
      this.a = $$0;
      this.f();
      this.h.clear();
   }

   public void a(io $$0, drb $$1) {
      if (!$$1.i() && $$1.z()) {
         evd $$2 = $$1.j(this.a, $$0);
         double $$3 = 0.25;
         $$2.b(
            ($$2x, $$3x, $$4, $$5, $$6, $$7) -> {
               double $$8 = Math.min(1.0, $$5 - $$2x);
               double $$9 = Math.min(1.0, $$6 - $$3x);
               double $$10 = Math.min(1.0, $$7 - $$4);
               int $$11 = Math.max(2, ayd.c($$8 / 0.25));
               int $$12 = Math.max(2, ayd.c($$9 / 0.25));
               int $$13 = Math.max(2, ayd.c($$10 / 0.25));

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
                           new gax(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void a(io $$0, it $$1) {
      drb $$2 = this.a.a_($$0);
      if ($$2.l() != dke.a && $$2.z()) {
         int $$3 = $$0.u();
         int $$4 = $$0.v();
         int $$5 = $$0.w();
         float $$6 = 0.1F;
         euf $$7 = $$2.j(this.a, $$0).a();
         double $$8 = (double)$$3 + this.j.j() * ($$7.d - $$7.a - 0.2F) + 0.1F + $$7.a;
         double $$9 = (double)$$4 + this.j.j() * ($$7.e - $$7.b - 0.2F) + 0.1F + $$7.b;
         double $$10 = (double)$$5 + this.j.j() * ($$7.f - $$7.c - 0.2F) + 0.1F + $$7.c;
         if ($$1 == it.a) {
            $$9 = (double)$$4 + $$7.b - 0.1F;
         }

         if ($$1 == it.b) {
            $$9 = (double)$$4 + $$7.e + 0.1F;
         }

         if ($$1 == it.c) {
            $$10 = (double)$$5 + $$7.c - 0.1F;
         }

         if ($$1 == it.d) {
            $$10 = (double)$$5 + $$7.f + 0.1F;
         }

         if ($$1 == it.e) {
            $$8 = (double)$$3 + $$7.a - 0.1F;
         }

         if ($$1 == it.f) {
            $$8 = (double)$$3 + $$7.d + 0.1F;
         }

         this.a(new gax(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
      }
   }

   public String d() {
      return String.valueOf(this.g.values().stream().mapToInt(Collection::size).sum());
   }

   private boolean a(kv $$0) {
      return this.o.getInt($$0) < $$0.a();
   }

   private void f() {
      this.g.clear();
      this.l.clear();
      this.h.clear();
      this.o.clear();
   }

   static class b implements gat {
      private List<gnv> a;

      @Override
      public gnv a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public gnv a(ayk $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<gnv> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends kw> {
      gab<T> create(gat var1);
   }
}
