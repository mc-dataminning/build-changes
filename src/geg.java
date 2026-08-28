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

public class geg implements aum {
   private static final Logger b = LogUtils.getLogger();
   private static final aku c = aku.a("particles");
   private static final alb d = alb.b("particles");
   private static final int e = 16384;
   private static final List<gei> f = ImmutableList.of(gei.a, gei.b, gei.c, gei.d);
   protected gax a;
   private final Map<gei, Queue<gee>> g = Maps.newIdentityHashMap();
   private final Queue<gfg> h = Queues.newArrayDeque();
   private final gwl i;
   private final azk j = azk.a();
   private final Int2ObjectMap<geh<?>> k = new Int2ObjectOpenHashMap();
   private final Queue<gee> l = Queues.newArrayDeque();
   private final Map<alb, geg.b> m = Maps.newHashMap();
   private final gwj n;
   private final Object2IntOpenHashMap<lk> o = new Object2IntOpenHashMap();

   public geg(gax $$0, gwl $$1) {
      this.n = new gwj(gwj.e);
      $$1.a(this.n.h(), this.n);
      this.a = $$0;
      this.i = $$1;
      this.e();
   }

   private void e() {
      this.a(ln.a, gdv.a::new);
      this.a(ln.c, new gcx.a());
      this.a(ln.b, new gfd.b());
      this.a(ln.d, gda.a::new);
      this.a(ln.aq, gcz.a::new);
      this.a(ln.ao, gdb.a::new);
      this.a(ln.at, gdc.a::new);
      this.a(ln.au, gdc.b::new);
      this.a(ln.e, gej.a::new);
      this.a(ln.P, gfc.a::new);
      this.a(ln.f, gde.c::new);
      this.a(ln.ap, gfk.a::new);
      this.a(ln.g, gde.a::new);
      this.a(ln.h, gdf.a::new);
      this.a(ln.as, gfc.b::new);
      this.a(ln.i, gdg::c);
      this.a(ln.j, gdg::d);
      this.a(ln.k, gdg::e);
      this.a(ln.l, gdg::a);
      this.a(ln.m, gdg::b);
      this.a(ln.n, gdi.a::new);
      this.a(ln.o, gdh.a::new);
      this.a(ln.p, gew.c::new);
      this.a(ln.q, new geb.a());
      this.a(ln.r, gde.b::new);
      this.a(ln.s, gdr.a::new);
      this.a(ln.t, gdl.a::new);
      this.a(ln.u, gew.b::new);
      this.a(ln.v, new gdx.a());
      this.a(ln.w, gdw.a::new);
      this.a(ln.B, geu.a::new);
      this.a(ln.C, gdn.a::new);
      this.a(ln.x, gdt.a::new);
      this.a(ln.y, gdt.b::new);
      this.a(ln.z, new gdu.a(3.0, 7, 0));
      this.a(ln.A, new gdu.a(1.0, 3, 2));
      this.a(ln.D, gdo.d::new);
      this.a(ln.E, gfj.a::new);
      this.a(ln.F, gdp.a::new);
      this.a(ln.G, gew.c::new);
      this.a(ln.I, gev.a::new);
      this.a(ln.J, gen.a::new);
      this.a(ln.K, geo.a::new);
      this.a(ln.M, gev.b::new);
      this.a(ln.L, gdp.a::new);
      this.a(ln.N, gdo.a::new);
      this.a(ln.O, gfc.d::new);
      this.a(ln.Q, gdv.b::new);
      this.a(ln.R, gew.a::new);
      this.a(ln.S, new gcy.b());
      this.a(ln.U, new gcy.c());
      this.a(ln.V, new gcy.a());
      this.a(ln.W, new gcy.d());
      this.a(ln.X, gdz.a::new);
      this.a(ln.Y, gea.a::new);
      this.a(ln.Z, gfc.e::new);
      this.a(ln.ar, gdr.b::new);
      this.a(ln.aa, ged.a::new);
      this.a(ln.ab, gdm.a::new);
      this.a(ln.ac, gek.a::new);
      this.a(ln.ad, gfl.a::new);
      this.a(ln.ae, ges.a::new);
      this.a(ln.af, gfn.a::new);
      this.a(ln.ag, gej.b::new);
      this.a(ln.aK, get.a::new);
      this.a(ln.ah, gex.a::new);
      this.a(ln.aj, gcv.a::new);
      this.a(ln.ak, gff.a::new);
      this.a(ln.ai, gfa.b::new);
      this.a(ln.al, gfb.c::new);
      this.a(ln.am, gey.a::new);
      this.a(ln.an, gew.d::new);
      this.a(ln.av, gdg::f);
      this.a(ln.aw, gdg::g);
      this.a(ln.ax, gdg::h);
      this.a(ln.ay, gdg::m);
      this.a(ln.az, gdg::n);
      this.a(ln.aD, gfb.b::new);
      this.a(ln.aA, gcu.a::new);
      this.a(ln.aB, gfb.a::new);
      this.a(ln.aC, gfb.d::new);
      this.a(ln.aE, gdg::o);
      this.a(ln.aF, gdg::p);
      this.a(ln.aG, gdg::q);
      this.a(ln.aH, gel.a::new);
      this.a(ln.aI, gfm.a::new);
      this.a(ln.aJ, gdp.b::new);
      this.a(ln.aN, gdg::i);
      this.a(ln.aO, gdg::j);
      this.a(ln.H, $$0 -> ($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> new gdd($$2, $$3, $$4, $$5, $$0));
      this.a(ln.aL, gdg::k);
      this.a(ln.aM, gdg::l);
      this.a(ln.T, gfi.a::new);
      this.a(ln.aP, gfa.a::new);
      this.a(ln.aQ, gds.b::new);
      this.a(ln.aR, gds.e::new);
      this.a(ln.aS, gds.d::new);
      this.a(ln.aT, gds.a::new);
      this.a(ln.aU, gds.c::new);
      this.a(ln.aV, gep.a::new);
      this.a(ln.aW, gfc.c::new);
      this.a(ln.aX, gdk.a::new);
      this.a(ln.aY, gfh.a::new);
      this.a(ln.aZ, gfh.a::new);
      this.a(ln.ba, gdr.c::new);
      this.a(ln.bb, new gfd.a());
      this.a(ln.bd, gew.c::new);
      this.a(ln.be, gew.c::new);
      this.a(ln.bc, gdq.a::new);
   }

   private <T extends ll> void a(lm<T> $$0, geh<T> $$1) {
      this.k.put(lu.i.a($$0), $$1);
   }

   private <T extends ll> void a(lm<T> $$0, geh.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            gfe $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
               $$10.a($$1x);
            }

            return $$10;
         });
   }

   private <T extends ll> void a(lm<T> $$0, geg.c<T> $$1) {
      geg.b $$2 = new geg.b();
      this.m.put(lu.i.b($$0), $$2);
      this.k.put(lu.i.a($$0), $$1.create($$2));
   }

   @Override
   public CompletableFuture<Void> a(aum.a $$0, aus $$1, bny $$2, bny $$3, Executor $$4, Executor $$5) {
      record a(alb a, Optional<List<alb>> b) {
      }

      CompletableFuture<List<a>> $$6 = CompletableFuture.<Map<alb, auq>>supplyAsync(() -> c.a($$1), $$4).thenCompose($$1x -> {
         List<CompletableFuture<a>> $$2x = new ArrayList<>($$1x.size());
         $$1x.forEach(($$2xx, $$3x) -> {
            alb $$4x = c.b($$2xx);
            $$2x.add(CompletableFuture.supplyAsync(() -> new a($$4x, this.a($$4x, $$3x)), $$4));
         });
         return ad.d($$2x);
      });
      CompletableFuture<gwf.a> $$7 = gwf.a(this.n).a($$1, d, 0, $$4).thenCompose(gwf.a::a);
      return CompletableFuture.allOf($$7, $$6).thenCompose($$0::a).thenAcceptAsync($$3x -> {
         this.f();
         $$3.a();
         $$3.a("upload");
         gwf.a $$4x = $$7.join();
         this.n.a($$4x);
         $$3.b("bindSpriteSets");
         Set<alb> $$5x = new HashSet<>();
         gwk $$6x = $$4x.e();
         $$6.join().forEach($$3xx -> {
            Optional<List<alb>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<gwk> $$5xx = new ArrayList<>();

               for (alb $$6xx : $$4xx.get()) {
                  gwk $$7x = $$4x.f().get($$6xx);
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
            b.warn("Missing particle sprites: {}", $$5x.stream().sorted().map(alb::toString).collect(Collectors.joining(",")));
         }

         $$3.c();
         $$3.b();
      }, $$5);
   }

   public void a() {
      this.n.g();
   }

   private Optional<List<alb>> a(alb $$0, auq $$1) {
      if (!this.m.containsKey($$0)) {
         b.debug("Redundant texture list for particle: {}", $$0);
         return Optional.empty();
      } else {
         try {
            Optional var5;
            try (Reader $$2 = $$1.e()) {
               gef $$3 = gef.a(ays.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(btj $$0, ll $$1) {
      this.h.add(new gfg(this.a, $$0, $$1));
   }

   public void a(btj $$0, ll $$1, int $$2) {
      this.h.add(new gfg(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public gee a(ll $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      gee $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends ll> gee b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      geh<T> $$7 = (geh<T>)this.k.get(lu.i.a($$0.a()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(gee $$0) {
      Optional<lk> $$1 = $$0.o();
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
         this.a.ah().a($$0.toString());
         this.a($$1x);
         this.a.ah().c();
      });
      if (!this.h.isEmpty()) {
         List<gfg> $$0 = Lists.newArrayList();

         for (gfg $$1 : this.h) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.h.removeAll($$0);
      }

      gee $$2;
      if (!this.l.isEmpty()) {
         while (($$2 = this.l.poll()) != null) {
            this.g.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<gee> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<gee> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            gee $$2 = $$1.next();
            this.b($$2);
            if (!$$2.m()) {
               $$2.o().ifPresent($$0x -> this.a($$0x, -1));
               $$1.remove();
            }
         }
      }
   }

   private void a(lk $$0, int $$1) {
      this.o.addTo($$0, $$1);
   }

   private void b(gee $$0) {
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

   public void a(ggt $$0, fhk $$1, float $$2) {
      $$0.c();
      RenderSystem.enableDepthTest();

      for (gei $$3 : f) {
         Queue<gee> $$4 = this.g.get($$3);
         if ($$4 != null && !$$4.isEmpty()) {
            fcw $$5 = fcw.b();
            fcp $$6 = $$3.a($$5, this.i);
            if ($$6 != null) {
               for (gee $$7 : $$4) {
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

               fct $$11 = $$6.a();
               if ($$11 != null) {
                  fcq.a($$11);
               }
            }
         }
      }

      RenderSystem.depthMask(true);
      RenderSystem.disableBlend();
      $$0.b();
   }

   public void a(@Nullable gax $$0) {
      this.a = $$0;
      this.f();
      this.h.clear();
   }

   public void a(je $$0, dua $$1) {
      if (!$$1.l() && $$1.D()) {
         eyx $$2 = $$1.f(this.a, $$0);
         double $$3 = 0.25;
         $$2.b(
            ($$2x, $$3x, $$4, $$5, $$6, $$7) -> {
               double $$8 = Math.min(1.0, $$5 - $$2x);
               double $$9 = Math.min(1.0, $$6 - $$3x);
               double $$10 = Math.min(1.0, $$7 - $$4);
               int $$11 = Math.max(2, azc.c($$8 / 0.25));
               int $$12 = Math.max(2, azc.c($$9 / 0.25));
               int $$13 = Math.max(2, azc.c($$10 / 0.25));

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
                           new gfd(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void a(je $$0, jj $$1) {
      dua $$2 = this.a.a_($$0);
      if ($$2.o() != dnc.a && $$2.D()) {
         int $$3 = $$0.u();
         int $$4 = $$0.v();
         int $$5 = $$0.w();
         float $$6 = 0.1F;
         exz $$7 = $$2.f(this.a, $$0).a();
         double $$8 = (double)$$3 + this.j.j() * ($$7.d - $$7.a - 0.2F) + 0.1F + $$7.a;
         double $$9 = (double)$$4 + this.j.j() * ($$7.e - $$7.b - 0.2F) + 0.1F + $$7.b;
         double $$10 = (double)$$5 + this.j.j() * ($$7.f - $$7.c - 0.2F) + 0.1F + $$7.c;
         if ($$1 == jj.a) {
            $$9 = (double)$$4 + $$7.b - 0.1F;
         }

         if ($$1 == jj.b) {
            $$9 = (double)$$4 + $$7.e + 0.1F;
         }

         if ($$1 == jj.c) {
            $$10 = (double)$$5 + $$7.c - 0.1F;
         }

         if ($$1 == jj.d) {
            $$10 = (double)$$5 + $$7.f + 0.1F;
         }

         if ($$1 == jj.e) {
            $$8 = (double)$$3 + $$7.a - 0.1F;
         }

         if ($$1 == jj.f) {
            $$8 = (double)$$3 + $$7.d + 0.1F;
         }

         this.a(new gfd(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
      }
   }

   public String d() {
      return String.valueOf(this.g.values().stream().mapToInt(Collection::size).sum());
   }

   private boolean a(lk $$0) {
      return this.o.getInt($$0) < $$0.a();
   }

   private void f() {
      this.g.clear();
      this.l.clear();
      this.h.clear();
      this.o.clear();
   }

   static class b implements gez {
      private List<gwk> a;

      @Override
      public gwk a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public gwk a(azk $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<gwk> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends ll> {
      geh<T> create(gez var1);
   }
}
