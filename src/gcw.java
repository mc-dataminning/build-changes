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

public class gcw implements atx {
   private static final Logger b = LogUtils.getLogger();
   private static final akm c = akm.a("particles");
   private static final akt d = new akt("particles");
   private static final int e = 16384;
   private static final List<gcy> f = ImmutableList.of(gcy.a, gcy.b, gcy.d, gcy.c, gcy.e);
   protected fzn a;
   private final Map<gcy, Queue<gcu>> g = Maps.newIdentityHashMap();
   private final Queue<gdw> h = Queues.newArrayDeque();
   private final gqz i;
   private final ayt j = ayt.a();
   private final Int2ObjectMap<gcx<?>> k = new Int2ObjectOpenHashMap();
   private final Queue<gcu> l = Queues.newArrayDeque();
   private final Map<akt, gcw.b> m = Maps.newHashMap();
   private final gqx n;
   private final Object2IntOpenHashMap<ky> o = new Object2IntOpenHashMap();

   public gcw(fzn $$0, gqz $$1) {
      this.n = new gqx(gqx.f);
      $$1.a(this.n.g(), this.n);
      this.a = $$0;
      this.i = $$1;
      this.e();
   }

   private void e() {
      this.a(lb.a, gcl.a::new);
      this.a(lb.c, new gbn.a());
      this.a(lb.b, new gdt.a());
      this.a(lb.d, gbq.a::new);
      this.a(lb.ao, gbp.a::new);
      this.a(lb.am, gbr.a::new);
      this.a(lb.ar, gbs.a::new);
      this.a(lb.as, gbs.b::new);
      this.a(lb.e, gcz.a::new);
      this.a(lb.N, gds.a::new);
      this.a(lb.f, gbu.c::new);
      this.a(lb.an, gea.a::new);
      this.a(lb.g, gbu.a::new);
      this.a(lb.h, gbv.a::new);
      this.a(lb.aq, gds.b::new);
      this.a(lb.i, gbw::c);
      this.a(lb.j, gbw::d);
      this.a(lb.k, gbw::e);
      this.a(lb.l, gbw::a);
      this.a(lb.m, gbw::b);
      this.a(lb.n, gby.a::new);
      this.a(lb.o, gbx.a::new);
      this.a(lb.p, gdm.c::new);
      this.a(lb.q, new gcr.a());
      this.a(lb.r, gbu.b::new);
      this.a(lb.s, gcg.a::new);
      this.a(lb.t, gcb.a::new);
      this.a(lb.u, gdm.b::new);
      this.a(lb.v, new gcn.a());
      this.a(lb.w, gcm.a::new);
      this.a(lb.A, gdk.a::new);
      this.a(lb.B, gcd.a::new);
      this.a(lb.x, gcj.a::new);
      this.a(lb.y, new gck.a(3.0, 7, 0));
      this.a(lb.z, new gck.a(1.0, 3, 2));
      this.a(lb.C, gce.d::new);
      this.a(lb.D, gdz.a::new);
      this.a(lb.E, gcf.a::new);
      this.a(lb.G, gdl.a::new);
      this.a(lb.H, gdd.a::new);
      this.a(lb.I, gde.a::new);
      this.a(lb.K, gdl.b::new);
      this.a(lb.J, gcf.a::new);
      this.a(lb.L, gce.a::new);
      this.a(lb.M, gds.d::new);
      this.a(lb.O, gcl.b::new);
      this.a(lb.P, gdm.a::new);
      this.a(lb.Q, new gbo.a());
      this.a(lb.T, new gbo.b());
      this.a(lb.U, new gbo.c());
      this.a(lb.V, gcp.a::new);
      this.a(lb.W, gcq.a::new);
      this.a(lb.X, gds.e::new);
      this.a(lb.ap, gcg.b::new);
      this.a(lb.Y, gct.a::new);
      this.a(lb.Z, gcc.a::new);
      this.a(lb.aa, $$0 -> new gda.a($$0, 0.9F, 0.3F, 1.0F));
      this.a(lb.ab, geb.a::new);
      this.a(lb.ac, gdi.a::new);
      this.a(lb.ad, ged.a::new);
      this.a(lb.ae, gcz.b::new);
      this.a(lb.aL, gdj.a::new);
      this.a(lb.af, gdn.a::new);
      this.a(lb.ah, gbl.a::new);
      this.a(lb.ai, gdv.a::new);
      this.a(lb.ag, gdq.b::new);
      this.a(lb.aj, gdr.c::new);
      this.a(lb.ak, gdo.a::new);
      this.a(lb.al, gdm.d::new);
      this.a(lb.at, gbw::f);
      this.a(lb.au, gbw::g);
      this.a(lb.av, gbw::h);
      this.a(lb.aw, gbw::m);
      this.a(lb.ax, gbw::n);
      this.a(lb.ay, gbw::o);
      this.a(lb.aC, gdr.b::new);
      this.a(lb.az, gbk.a::new);
      this.a(lb.aA, gdr.a::new);
      this.a(lb.aB, gdr.d::new);
      this.a(lb.aD, gbw::p);
      this.a(lb.aE, gbw::q);
      this.a(lb.aF, gbw::r);
      this.a(lb.aG, $$0 -> new gdb.a($$0, 0.9F, 0.3F, 1.0F));
      this.a(lb.aI, $$0 -> new gdb.a($$0, 0.6F, 1.0F, 0.2F));
      this.a(lb.aH, $$0 -> new gda.a($$0, 0.6F, 1.0F, 0.2F));
      this.a(lb.aJ, gec.a::new);
      this.a(lb.aK, gcf.b::new);
      this.a(lb.aO, gbw::i);
      this.a(lb.aP, gbw::j);
      this.a(lb.F, $$0 -> ($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> new gbt($$2, $$3, $$4, $$5, $$0));
      this.a(lb.aM, gbw::k);
      this.a(lb.aN, gbw::l);
      this.a(lb.R, gdy.a::new);
      this.a(lb.aQ, gdq.a::new);
      this.a(lb.aR, gci.b::new);
      this.a(lb.aS, gci.e::new);
      this.a(lb.aT, gci.d::new);
      this.a(lb.aU, gci.a::new);
      this.a(lb.aV, gci.c::new);
      this.a(lb.aW, gdf.a::new);
      this.a(lb.S, gch.a::new);
      this.a(lb.aX, gds.c::new);
      this.a(lb.aY, gca.a::new);
      this.a(lb.aZ, gdx.a::new);
      this.a(lb.ba, gcg.c::new);
   }

   private <T extends kz> void a(la<T> $$0, gcx<T> $$1) {
      this.k.put(lh.j.a($$0), $$1);
   }

   private <T extends kz> void a(la<T> $$0, gcx.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            gdu $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
               $$10.a($$1x);
            }

            return $$10;
         });
   }

   private <T extends kz> void a(la<T> $$0, gcw.c<T> $$1) {
      gcw.b $$2 = new gcw.b();
      this.m.put(lh.j.b($$0), $$2);
      this.k.put(lh.j.a($$0), $$1.create($$2));
   }

   @Override
   public CompletableFuture<Void> a(atx.a $$0, aud $$1, bmo $$2, bmo $$3, Executor $$4, Executor $$5) {
      record a(akt a, Optional<List<akt>> b) {
      }

      CompletableFuture<List<a>> $$6 = CompletableFuture.<Map<akt, aub>>supplyAsync(() -> c.a($$1), $$4).thenCompose($$1x -> {
         List<CompletableFuture<a>> $$2x = new ArrayList<>($$1x.size());
         $$1x.forEach(($$2xx, $$3x) -> {
            akt $$4x = c.b($$2xx);
            $$2x.add(CompletableFuture.supplyAsync(() -> new a($$4x, this.a($$4x, $$3x)), $$4));
         });
         return ad.d($$2x);
      });
      CompletableFuture<gqt.a> $$7 = gqt.a(this.n).a($$1, d, 0, $$4).thenCompose(gqt.a::a);
      return CompletableFuture.allOf($$7, $$6).thenCompose($$0::a).thenAcceptAsync($$3x -> {
         this.f();
         $$3.a();
         $$3.a("upload");
         gqt.a $$4x = $$7.join();
         this.n.a($$4x);
         $$3.b("bindSpriteSets");
         Set<akt> $$5x = new HashSet<>();
         gqy $$6x = $$4x.e();
         $$6.join().forEach($$3xx -> {
            Optional<List<akt>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<gqy> $$5xx = new ArrayList<>();

               for (akt $$6xx : $$4xx.get()) {
                  gqy $$7x = $$4x.f().get($$6xx);
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
            b.warn("Missing particle sprites: {}", $$5x.stream().sorted().map(akt::toString).collect(Collectors.joining(",")));
         }

         $$3.c();
         $$3.b();
      }, $$5);
   }

   public void a() {
      this.n.f();
   }

   private Optional<List<akt>> a(akt $$0, aub $$1) {
      if (!this.m.containsKey($$0)) {
         b.debug("Redundant texture list for particle: {}", $$0);
         return Optional.empty();
      } else {
         try {
            Optional var5;
            try (Reader $$2 = $$1.e()) {
               gcv $$3 = gcv.a(ayc.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(brv $$0, kz $$1) {
      this.h.add(new gdw(this.a, $$0, $$1));
   }

   public void a(brv $$0, kz $$1, int $$2) {
      this.h.add(new gdw(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public gcu a(kz $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      gcu $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends kz> gcu b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      gcx<T> $$7 = (gcx<T>)this.k.get(lh.j.a($$0.a()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(gcu $$0) {
      Optional<ky> $$1 = $$0.o();
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
         this.a.ag().a($$0.toString());
         this.a($$1x);
         this.a.ag().c();
      });
      if (!this.h.isEmpty()) {
         List<gdw> $$0 = Lists.newArrayList();

         for (gdw $$1 : this.h) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.h.removeAll($$0);
      }

      gcu $$2;
      if (!this.l.isEmpty()) {
         while (($$2 = this.l.poll()) != null) {
            this.g.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<gcu> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<gcu> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            gcu $$2 = $$1.next();
            this.b($$2);
            if (!$$2.m()) {
               $$2.o().ifPresent($$0x -> this.a($$0x, -1));
               $$1.remove();
            }
         }
      }
   }

   private void a(ky $$0, int $$1) {
      this.o.addTo($$0, $$1);
   }

   private void b(gcu $$0) {
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

   public void a(gff $$0, ffu $$1, float $$2) {
      $$0.c();
      RenderSystem.enableDepthTest();

      for (gcy $$3 : f) {
         Iterable<gcu> $$4 = this.g.get($$3);
         if ($$4 != null) {
            RenderSystem.setShader(gez::u);
            fbe $$5 = fbe.b();
            fax $$6 = $$5.d();
            $$3.a($$6, this.i);

            for (gcu $$7 : $$4) {
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

            $$3.a($$5);
         }
      }

      RenderSystem.depthMask(true);
      RenderSystem.disableBlend();
      $$0.b();
   }

   public void a(@Nullable fzn $$0) {
      this.a = $$0;
      this.f();
      this.h.clear();
   }

   public void a(ir $$0, dtc $$1) {
      if (!$$1.i() && $$1.z()) {
         exn $$2 = $$1.j(this.a, $$0);
         double $$3 = 0.25;
         $$2.b(
            ($$2x, $$3x, $$4, $$5, $$6, $$7) -> {
               double $$8 = Math.min(1.0, $$5 - $$2x);
               double $$9 = Math.min(1.0, $$6 - $$3x);
               double $$10 = Math.min(1.0, $$7 - $$4);
               int $$11 = Math.max(2, aym.c($$8 / 0.25));
               int $$12 = Math.max(2, aym.c($$9 / 0.25));
               int $$13 = Math.max(2, aym.c($$10 / 0.25));

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
                           new gdt(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void a(ir $$0, iw $$1) {
      dtc $$2 = this.a.a_($$0);
      if ($$2.l() != dlw.a && $$2.z()) {
         int $$3 = $$0.u();
         int $$4 = $$0.v();
         int $$5 = $$0.w();
         float $$6 = 0.1F;
         ewp $$7 = $$2.j(this.a, $$0).a();
         double $$8 = (double)$$3 + this.j.j() * ($$7.d - $$7.a - 0.2F) + 0.1F + $$7.a;
         double $$9 = (double)$$4 + this.j.j() * ($$7.e - $$7.b - 0.2F) + 0.1F + $$7.b;
         double $$10 = (double)$$5 + this.j.j() * ($$7.f - $$7.c - 0.2F) + 0.1F + $$7.c;
         if ($$1 == iw.a) {
            $$9 = (double)$$4 + $$7.b - 0.1F;
         }

         if ($$1 == iw.b) {
            $$9 = (double)$$4 + $$7.e + 0.1F;
         }

         if ($$1 == iw.c) {
            $$10 = (double)$$5 + $$7.c - 0.1F;
         }

         if ($$1 == iw.d) {
            $$10 = (double)$$5 + $$7.f + 0.1F;
         }

         if ($$1 == iw.e) {
            $$8 = (double)$$3 + $$7.a - 0.1F;
         }

         if ($$1 == iw.f) {
            $$8 = (double)$$3 + $$7.d + 0.1F;
         }

         this.a(new gdt(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
      }
   }

   public String d() {
      return String.valueOf(this.g.values().stream().mapToInt(Collection::size).sum());
   }

   private boolean a(ky $$0) {
      return this.o.getInt($$0) < $$0.a();
   }

   private void f() {
      this.g.clear();
      this.l.clear();
      this.h.clear();
      this.o.clear();
   }

   static class b implements gdp {
      private List<gqy> a;

      @Override
      public gqy a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public gqy a(ayt $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<gqy> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends kz> {
      gcx<T> create(gdp var1);
   }
}
