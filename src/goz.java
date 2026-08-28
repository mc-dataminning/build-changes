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

public class goz implements avi {
   private static final Logger b = LogUtils.getLogger();
   private static final alk c = alk.a("particles");
   private static final int d = 16384;
   private static final List<gpb> e = List.of(gpb.a, gpb.b, gpb.c);
   protected glo a;
   private final Map<gpb, Queue<gox>> f = Maps.newIdentityHashMap();
   private final Queue<gpz> g = Queues.newArrayDeque();
   private final bai h = bai.a();
   private final Int2ObjectMap<gpa<?>> i = new Int2ObjectOpenHashMap();
   private final Queue<gox> j = Queues.newArrayDeque();
   private final Map<alr, goz.b> k = Maps.newHashMap();
   private final hkp l;
   private final Object2IntOpenHashMap<lw> m = new Object2IntOpenHashMap();

   public goz(glo $$0, hks $$1) {
      this.l = new hkp(hkp.d);
      $$1.a(this.l.e(), this.l);
      this.a = $$0;
      this.d();
   }

   private void d() {
      this.a(lz.a, goo.a::new);
      this.a(lz.c, new gnp.a());
      this.a(lz.b, new gpw.c());
      this.a(lz.d, gns.a::new);
      this.a(lz.at, gnr.a::new);
      this.a(lz.ar, gnt.a::new);
      this.a(lz.aw, gnu.a::new);
      this.a(lz.ax, gnu.b::new);
      this.a(lz.e, gpc.a::new);
      this.a(lz.R, gpv.a::new);
      this.a(lz.f, gnv.c::new);
      this.a(lz.as, gqe.a::new);
      this.a(lz.g, gnv.a::new);
      this.a(lz.h, gnw.a::new);
      this.a(lz.av, gpv.b::new);
      this.a(lz.i, gnx::c);
      this.a(lz.j, gnx::d);
      this.a(lz.k, gnx::e);
      this.a(lz.l, gnx::a);
      this.a(lz.m, gnx::b);
      this.a(lz.n, gnz.a::new);
      this.a(lz.o, gny.a::new);
      this.a(lz.p, gpp.c::new);
      this.a(lz.q, new gou.a());
      this.a(lz.r, gnv.b::new);
      this.a(lz.s, gok.a::new);
      this.a(lz.t, goc.a::new);
      this.a(lz.u, gpp.b::new);
      this.a(lz.v, new goq.a());
      this.a(lz.w, gop.a::new);
      this.a(lz.B, gpn.a::new);
      this.a(lz.C, goe.a::new);
      this.a(lz.x, gom.a::new);
      this.a(lz.y, gom.b::new);
      this.a(lz.z, new gon.a(3.0, 7, 0));
      this.a(lz.A, new gon.a(1.0, 3, 2));
      this.a(lz.D, goh.d::new);
      this.a(lz.E, gqd.a::new);
      this.a(lz.F, goi.a::new);
      this.a(lz.G, gpp.c::new);
      this.a(lz.K, gpo.a::new);
      this.a(lz.L, gpg.a::new);
      this.a(lz.M, gph.a::new);
      this.a(lz.O, gpo.b::new);
      this.a(lz.N, goi.a::new);
      this.a(lz.P, goh.a::new);
      this.a(lz.Q, gpv.d::new);
      this.a(lz.S, goo.b::new);
      this.a(lz.T, gpp.a::new);
      this.a(lz.U, new gnq.c());
      this.a(lz.X, new gnq.d());
      this.a(lz.Y, new gnq.a());
      this.a(lz.Z, new gnq.e());
      this.a(lz.aa, gos.a::new);
      this.a(lz.ab, got.a::new);
      this.a(lz.ac, gpv.e::new);
      this.a(lz.au, gok.b::new);
      this.a(lz.ad, gow.a::new);
      this.a(lz.ae, god.a::new);
      this.a(lz.af, gpd.a::new);
      this.a(lz.ag, gqf.a::new);
      this.a(lz.ah, gpl.a::new);
      this.a(lz.ai, gqh.a::new);
      this.a(lz.aj, gpc.b::new);
      this.a(lz.aN, gpm.a::new);
      this.a(lz.ak, gpq.a::new);
      this.a(lz.am, gnn.a::new);
      this.a(lz.an, gpy.a::new);
      this.a(lz.al, gpt.b::new);
      this.a(lz.ao, gpu.c::new);
      this.a(lz.ap, gpr.a::new);
      this.a(lz.aq, gpp.d::new);
      this.a(lz.ay, gnx::f);
      this.a(lz.az, gnx::g);
      this.a(lz.aA, gnx::h);
      this.a(lz.aB, gnx::m);
      this.a(lz.aC, gnx::n);
      this.a(lz.aG, gpu.b::new);
      this.a(lz.aD, gnm.a::new);
      this.a(lz.aE, gpu.a::new);
      this.a(lz.aF, gpu.d::new);
      this.a(lz.aH, gnx::o);
      this.a(lz.aI, gnx::p);
      this.a(lz.aJ, gnx::q);
      this.a(lz.aK, gpe.a::new);
      this.a(lz.aL, gqg.a::new);
      this.a(lz.aM, goi.b::new);
      this.a(lz.aQ, gnx::i);
      this.a(lz.aR, gnx::j);
      this.a(lz.H, gof.a::new);
      this.a(lz.I, gof.b::new);
      this.a(lz.J, gof.c::new);
      this.a(lz.aO, gnx::k);
      this.a(lz.aP, gnx::l);
      this.a(lz.V, gqc.a::new);
      this.a(lz.W, gqa.a::new);
      this.a(lz.aS, gpt.a::new);
      this.a(lz.aT, gol.b::new);
      this.a(lz.aU, gol.e::new);
      this.a(lz.aV, gol.d::new);
      this.a(lz.aW, gol.a::new);
      this.a(lz.aX, gol.c::new);
      this.a(lz.aY, gpi.a::new);
      this.a(lz.aZ, gpv.c::new);
      this.a(lz.ba, gob.a::new);
      this.a(lz.bb, gqb.a::new);
      this.a(lz.bc, gqb.a::new);
      this.a(lz.bd, gok.c::new);
      this.a(lz.be, new gpw.b());
      this.a(lz.bg, gpp.c::new);
      this.a(lz.bh, gpp.c::new);
      this.a(lz.bf, goj.a::new);
      this.a(lz.bi, new gpw.a());
      this.a(lz.bj, gog.a::new);
   }

   private <T extends lx> void a(ly<T> $$0, gpa<T> $$1) {
      this.i.put(mh.i.a($$0), $$1);
   }

   private <T extends lx> void a(ly<T> $$0, gpa.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            gpx $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
               $$10.a($$1x);
            }

            return $$10;
         });
   }

   private <T extends lx> void a(ly<T> $$0, goz.c<T> $$1) {
      goz.b $$2 = new goz.b();
      this.k.put(mh.i.b($$0), $$2);
      this.i.put(mh.i.a($$0), $$1.create($$2));
   }

   @Override
   public CompletableFuture<Void> reload(avi.a $$0, avo $$1, Executor $$2, Executor $$3) {
      record a(alr a, Optional<List<alr>> b) {
      }

      CompletableFuture<List<a>> $$4 = CompletableFuture.<Map<alr, avm>>supplyAsync(() -> c.a($$1), $$2).thenCompose($$1x -> {
         List<CompletableFuture<a>> $$2x = new ArrayList<>($$1x.size());
         $$1x.forEach(($$2xx, $$3x) -> {
            alr $$4x = c.b($$2xx);
            $$2x.add(CompletableFuture.supplyAsync(() -> new a($$4x, this.a($$4x, $$3x)), $$2));
         });
         return ag.d($$2x);
      });
      CompletableFuture<hkl.a> $$5 = hkl.a(this.l).a($$1, hmp.k, 0, $$2).thenCompose(hkl.a::a);
      return CompletableFuture.allOf($$5, $$4).thenCompose($$0::wait).thenAcceptAsync($$2x -> {
         this.e();
         brm $$3x = brl.a();
         $$3x.a("upload");
         hkl.a $$4x = $$5.join();
         this.l.a($$4x);
         $$3x.b("bindSpriteSets");
         Set<alr> $$5x = new HashSet<>();
         hkq $$6 = $$4x.e();
         $$4.join().forEach($$3xx -> {
            Optional<List<alr>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<hkq> $$5xx = new ArrayList<>();

               for (alr $$6x : $$4xx.get()) {
                  hkq $$7 = $$4x.f().get($$6x);
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

               this.k.get($$3xx.a()).a($$5xx);
            }
         });
         if (!$$5x.isEmpty()) {
            b.warn("Missing particle sprites: {}", $$5x.stream().sorted().map(alr::toString).collect(Collectors.joining(",")));
         }

         $$3x.c();
      }, $$3);
   }

   public void a() {
      this.l.d();
   }

   private Optional<List<alr>> a(alr $$0, avm $$1) {
      if (!this.k.containsKey($$0)) {
         b.debug("Redundant texture list for particle: {}", $$0);
         return Optional.empty();
      } else {
         try {
            Optional var5;
            try (Reader $$2 = $$1.e()) {
               goy $$3 = goy.a(azo.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(bxe $$0, lx $$1) {
      this.g.add(new gpz(this.a, $$0, $$1));
   }

   public void a(bxe $$0, lx $$1, int $$2) {
      this.g.add(new gpz(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public gox a(lx $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      gox $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends lx> gox b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      gpa<T> $$7 = (gpa<T>)this.i.get(mh.i.a($$0.a()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(gox $$0) {
      Optional<lw> $$1 = $$0.o();
      if ($$1.isPresent()) {
         if (this.a($$1.get())) {
            this.j.add($$0);
            this.a($$1.get(), 1);
         }
      } else {
         this.j.add($$0);
      }
   }

   public void b() {
      this.f.forEach(($$0, $$1x) -> {
         brl.a().a($$0.toString());
         this.a($$1x);
         brl.a().c();
      });
      if (!this.g.isEmpty()) {
         List<gpz> $$0 = Lists.newArrayList();

         for (gpz $$1 : this.g) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.g.removeAll($$0);
      }

      gox $$2;
      if (!this.j.isEmpty()) {
         while (($$2 = this.j.poll()) != null) {
            this.f.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<gox> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<gox> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            gox $$2 = $$1.next();
            this.b($$2);
            if (!$$2.m()) {
               $$2.o().ifPresent($$0x -> this.a($$0x, -1));
               $$1.remove();
            }
         }
      }
   }

   private void a(lw $$0, int $$1) {
      this.m.addTo($$0, $$1);
   }

   private void b(gox $$0) {
      try {
         $$0.a();
      } catch (Throwable var5) {
         p $$2 = p.a(var5, "Ticking Particle");
         q $$3 = $$2.a("Particle being ticked");
         $$3.a("Particle", $$0::toString);
         $$3.a("Particle Type", $$0.b()::toString);
         throw new aa($$2);
      }
   }

   public void a(fpy $$0, float $$1, grn.a $$2) {
      for (gpb $$3 : e) {
         Queue<gox> $$4 = this.f.get($$3);
         if ($$4 != null && !$$4.isEmpty()) {
            a($$0, $$1, $$2, $$3, $$4);
         }
      }

      Queue<gox> $$5 = this.f.get(gpb.d);
      if ($$5 != null && !$$5.isEmpty()) {
         a($$0, $$1, $$2, $$5);
      }

      $$2.b();
   }

   private static void a(fpy $$0, float $$1, grn.a $$2, gpb $$3, Queue<gox> $$4) {
      flg $$5 = $$2.getBuffer(Objects.requireNonNull($$3.b()));

      for (gox $$6 : $$4) {
         try {
            $$6.a($$5, $$0, $$1);
         } catch (Throwable var11) {
            p $$8 = p.a(var11, "Rendering Particle");
            q $$9 = $$8.a("Particle being rendered");
            $$9.a("Particle", $$6::toString);
            $$9.a("Particle Type", $$3::toString);
            throw new aa($$8);
         }
      }
   }

   private static void a(fpy $$0, float $$1, grn.a $$2, Queue<gox> $$3) {
      fld $$4 = new fld();

      for (gox $$5 : $$3) {
         try {
            $$5.a($$4, $$2, $$0, $$1);
         } catch (Throwable var10) {
            p $$7 = p.a(var10, "Rendering Particle");
            q $$8 = $$7.a("Particle being rendered");
            $$8.a("Particle", $$5::toString);
            $$8.a("Particle Type", "Custom");
            throw new aa($$7);
         }
      }
   }

   public void a(@Nullable glo $$0) {
      this.a = $$0;
      this.e();
      this.g.clear();
   }

   public void a(iw $$0, ebq $$1) {
      if (!$$1.l() && $$1.D()) {
         fgw $$2 = $$1.f(this.a, $$0);
         double $$3 = 0.25;
         $$2.b(
            ($$2x, $$3x, $$4, $$5, $$6, $$7) -> {
               double $$8 = Math.min(1.0, $$5 - $$2x);
               double $$9 = Math.min(1.0, $$6 - $$3x);
               double $$10 = Math.min(1.0, $$7 - $$4);
               int $$11 = Math.max(2, azz.c($$8 / 0.25));
               int $$12 = Math.max(2, azz.c($$9 / 0.25));
               int $$13 = Math.max(2, azz.c($$10 / 0.25));

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
                           new gpw(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void a(iw $$0, jc $$1) {
      ebq $$2 = this.a.a_($$0);
      if ($$2.o() != dub.a && $$2.D()) {
         int $$3 = $$0.u();
         int $$4 = $$0.v();
         int $$5 = $$0.w();
         float $$6 = 0.1F;
         ffx $$7 = $$2.f(this.a, $$0).a();
         double $$8 = (double)$$3 + this.h.j() * ($$7.d - $$7.a - 0.2F) + 0.1F + $$7.a;
         double $$9 = (double)$$4 + this.h.j() * ($$7.e - $$7.b - 0.2F) + 0.1F + $$7.b;
         double $$10 = (double)$$5 + this.h.j() * ($$7.f - $$7.c - 0.2F) + 0.1F + $$7.c;
         if ($$1 == jc.a) {
            $$9 = (double)$$4 + $$7.b - 0.1F;
         }

         if ($$1 == jc.b) {
            $$9 = (double)$$4 + $$7.e + 0.1F;
         }

         if ($$1 == jc.c) {
            $$10 = (double)$$5 + $$7.c - 0.1F;
         }

         if ($$1 == jc.d) {
            $$10 = (double)$$5 + $$7.f + 0.1F;
         }

         if ($$1 == jc.e) {
            $$8 = (double)$$3 + $$7.a - 0.1F;
         }

         if ($$1 == jc.f) {
            $$8 = (double)$$3 + $$7.d + 0.1F;
         }

         this.a(new gpw(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
      }
   }

   public String c() {
      return String.valueOf(this.f.values().stream().mapToInt(Collection::size).sum());
   }

   private boolean a(lw $$0) {
      return this.m.getInt($$0) < $$0.a();
   }

   private void e() {
      this.f.clear();
      this.j.clear();
      this.g.clear();
      this.m.clear();
   }

   static class b implements gps {
      private List<hkq> a;

      @Override
      public hkq a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public hkq a(bai $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<hkq> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends lx> {
      gpa<T> create(gps var1);
   }
}
