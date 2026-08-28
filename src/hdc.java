import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

public class hdc {
   private static final Marker d = MarkerFactory.getMarker("SOUNDS");
   private static final Logger e = LogUtils.getLogger();
   private static final float f = 0.5F;
   private static final float g = 2.0F;
   private static final float h = 0.0F;
   private static final float i = 1.0F;
   private static final int j = 20;
   private static final Set<ali> k = Sets.newHashSet();
   private static final long l = 1000L;
   public static final String a = "FOR THE DEBUG!";
   public static final String b = "OpenAL Soft on ";
   public static final int c = "OpenAL Soft on ".length();
   private final hdf m;
   private final fjm n;
   private boolean o;
   private final fbt p = new fbt();
   private final fbu q = this.p.e();
   private final hdb r;
   private final hdd s = new hdd();
   private final hcu t = new hcu(this.p, this.s);
   private int u;
   private long v;
   private final AtomicReference<hdc.a> w = new AtomicReference<>(hdc.a.c);
   private final Map<hca, hcu.a> x = Maps.newHashMap();
   private final Multimap<awm, hca> y = HashMultimap.create();
   private final List<hcb> z = Lists.newArrayList();
   private final Map<hca, Integer> A = Maps.newHashMap();
   private final Map<hca, Integer> B = Maps.newHashMap();
   private final List<hde> C = Lists.newArrayList();
   private final List<hcb> D = Lists.newArrayList();
   private final List<hbx> E = Lists.newArrayList();

   public hdc(hdf $$0, fjm $$1, ave $$2) {
      this.m = $$0;
      this.n = $$1;
      this.r = new hdb($$2);
   }

   public void a() {
      k.clear();

      for (awk $$0 : ly.b) {
         if ($$0 != awl.qX) {
            ali $$1 = $$0.a();
            if (this.m.a($$1) == null) {
               e.warn("Missing sound for event: {}", ly.b.b($$0));
               k.add($$1);
            }
         }
      }

      this.b();
      this.j();
   }

   private synchronized void j() {
      if (!this.o) {
         try {
            String $$0 = this.n.av().c();
            this.p.a("".equals($$0) ? null : $$0, this.n.Z().c());
            this.q.b();
            this.q.a(this.n.a(awm.a));
            this.r.a(this.E).thenRun(this.E::clear);
            this.o = true;
            e.info(d, "Sound engine started");
         } catch (RuntimeException var2) {
            e.error(d, "Error starting SoundSystem. Turning off sounds & music", var2);
         }
      }
   }

   private float a(@Nullable awm $$0) {
      return $$0 != null && $$0 != awm.a ? this.n.a($$0) : 1.0F;
   }

   public void a(awm $$0, float $$1) {
      if (this.o) {
         if ($$0 == awm.a) {
            this.q.a($$1);
         } else {
            this.x.forEach(($$0x, $$1x) -> {
               float $$2 = this.h($$0x);
               $$1x.a($$1xx -> {
                  if ($$2 <= 0.0F) {
                     $$1xx.f();
                  } else {
                     $$1xx.b($$2);
                  }
               });
            });
         }
      }
   }

   public void b() {
      if (this.o) {
         this.d();
         this.r.a();
         this.p.d();
         this.o = false;
      }
   }

   public void c() {
      if (this.o) {
         this.p.d();
      }
   }

   public void a(hca $$0) {
      if (this.o) {
         hcu.a $$1 = this.x.get($$0);
         if ($$1 != null) {
            $$1.a(fbs::f);
         }
      }
   }

   public void d() {
      if (this.o) {
         this.s.a();
         this.x.values().forEach($$0 -> $$0.a(fbs::f));
         this.x.clear();
         this.t.b();
         this.A.clear();
         this.z.clear();
         this.y.clear();
         this.B.clear();
         this.D.clear();
      }
   }

   public void a(hde $$0) {
      this.C.add($$0);
   }

   public void b(hde $$0) {
      this.C.remove($$0);
   }

   private boolean k() {
      if (this.p.h()) {
         e.info("Audio device was lost!");
         return true;
      } else {
         long $$0 = ae.c();
         boolean $$1 = $$0 - this.v >= 1000L;
         if ($$1) {
            this.v = $$0;
            if (this.w.compareAndSet(hdc.a.c, hdc.a.a)) {
               String $$2 = this.n.av().c();
               ae.h().execute(() -> {
                  if ("".equals($$2)) {
                     if (this.p.c()) {
                        e.info("System default audio device has changed!");
                        this.w.compareAndSet(hdc.a.a, hdc.a.b);
                     }
                  } else if (!this.p.b().equals($$2) && this.p.g().contains($$2)) {
                     e.info("Preferred audio device has become available!");
                     this.w.compareAndSet(hdc.a.a, hdc.a.b);
                  }

                  this.w.compareAndSet(hdc.a.a, hdc.a.c);
               });
            }
         }

         return this.w.compareAndSet(hdc.a.b, hdc.a.c);
      }
   }

   public void a(boolean $$0) {
      if (this.k()) {
         this.a();
      }

      if (!$$0) {
         this.l();
      }

      this.t.a();
   }

   private void l() {
      this.u++;
      this.D.stream().filter(hca::s).forEach(this::c);
      this.D.clear();

      for (hcb $$0 : this.z) {
         if (!$$0.s()) {
            this.a((hca)$$0);
         }

         $$0.q();
         if ($$0.m()) {
            this.a((hca)$$0);
         } else {
            float $$1 = this.h($$0);
            float $$2 = this.g($$0);
            ezn $$3 = new ezn($$0.h(), $$0.i(), $$0.j());
            hcu.a $$4 = this.x.get($$0);
            if ($$4 != null) {
               $$4.a($$3x -> {
                  $$3x.b($$1);
                  $$3x.a($$2);
                  $$3x.a($$3);
               });
            }
         }
      }

      Iterator<Entry<hca, hcu.a>> $$5 = this.x.entrySet().iterator();

      while ($$5.hasNext()) {
         Entry<hca, hcu.a> $$6 = $$5.next();
         hcu.a $$7 = $$6.getValue();
         hca $$8 = $$6.getKey();
         float $$9 = this.n.a($$8.c());
         if ($$9 <= 0.0F) {
            $$7.a(fbs::f);
            $$5.remove();
         } else if ($$7.a()) {
            int $$10 = this.B.get($$8);
            if ($$10 <= this.u) {
               if (e($$8)) {
                  this.A.put($$8, this.u + $$8.e());
               }

               $$5.remove();
               e.debug(d, "Removed channel {} because it's not playing anymore", $$7);
               this.B.remove($$8);

               try {
                  this.y.remove($$8.c(), $$8);
               } catch (RuntimeException var8) {
               }

               if ($$8 instanceof hcb) {
                  this.z.remove($$8);
               }
            }
         }
      }

      Iterator<Entry<hca, Integer>> $$11 = this.A.entrySet().iterator();

      while ($$11.hasNext()) {
         Entry<hca, Integer> $$12 = $$11.next();
         if (this.u >= $$12.getValue()) {
            hca $$13 = $$12.getKey();
            if ($$13 instanceof hcb) {
               ((hcb)$$13).q();
            }

            this.c($$13);
            $$11.remove();
         }
      }
   }

   private static boolean d(hca $$0) {
      return $$0.e() > 0;
   }

   private static boolean e(hca $$0) {
      return $$0.d() && d($$0);
   }

   private static boolean f(hca $$0) {
      return $$0.d() && !d($$0);
   }

   public boolean b(hca $$0) {
      if (!this.o) {
         return false;
      } else {
         return this.B.containsKey($$0) && this.B.get($$0) <= this.u ? true : this.x.containsKey($$0);
      }
   }

   public void c(hca $$0) {
      if (this.o) {
         if ($$0.s()) {
            hdg $$1 = $$0.a(this.m);
            ali $$2 = $$0.a();
            if ($$1 == null) {
               if (k.add($$2)) {
                  e.warn(d, "Unable to play unknown soundEvent: {}", $$2);
               }
            } else {
               hbx $$3 = $$0.b();
               if ($$3 != hdf.e) {
                  if ($$3 == hdf.b) {
                     if (k.add($$2)) {
                        e.warn(d, "Unable to play empty soundEvent: {}", $$2);
                     }
                  } else {
                     float $$4 = $$0.f();
                     float $$5 = Math.max($$4, 1.0F) * (float)$$3.i();
                     awm $$6 = $$0.c();
                     float $$7 = this.a($$4, $$6);
                     float $$8 = this.g($$0);
                     hca.a $$9 = $$0.k();
                     boolean $$10 = $$0.l();
                     if ($$7 == 0.0F && !$$0.r()) {
                        e.debug(d, "Skipped playing sound {}, volume was zero.", $$3.a());
                     } else {
                        ezn $$11 = new ezn($$0.h(), $$0.i(), $$0.j());
                        if (!this.C.isEmpty()) {
                           float $$12 = !$$10 && $$9 != hca.a.a ? $$5 : Float.POSITIVE_INFINITY;

                           for (hde $$13 : this.C) {
                              $$13.a($$0, $$1, $$12);
                           }
                        }

                        if (this.q.a() <= 0.0F) {
                           e.debug(d, "Skipped playing soundEvent: {}, master volume was zero", $$2);
                        } else {
                           boolean $$14 = f($$0);
                           boolean $$15 = $$3.g();
                           CompletableFuture<hcu.a> $$16 = this.t.a($$3.g() ? fbt.c.b : fbt.c.a);
                           hcu.a $$17 = $$16.join();
                           if ($$17 == null) {
                              if (ab.aV) {
                                 e.warn("Failed to create new sound handle");
                              }
                           } else {
                              e.debug(d, "Playing sound {} for event {}", $$3.a(), $$2);
                              this.B.put($$0, this.u + 20);
                              this.x.put($$0, $$17);
                              this.y.put($$6, $$0);
                              $$17.a($$8x -> {
                                 $$8x.a($$8);
                                 $$8x.b($$7);
                                 if ($$9 == hca.a.b) {
                                    $$8x.c($$5);
                                 } else {
                                    $$8x.i();
                                 }

                                 $$8x.a($$14 && !$$15);
                                 $$8x.a($$11);
                                 $$8x.b($$10);
                              });
                              if (!$$15) {
                                 this.r.a($$3.b()).thenAccept($$1x -> $$17.a($$1xx -> {
                                       $$1xx.a($$1x);
                                       $$1xx.c();
                                    }));
                              } else {
                                 this.r.a($$3.b(), $$14).thenAccept($$1x -> $$17.a($$1xx -> {
                                       $$1xx.a($$1x);
                                       $$1xx.c();
                                    }));
                              }

                              if ($$0 instanceof hcb) {
                                 this.z.add((hcb)$$0);
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public void a(hcb $$0) {
      this.D.add($$0);
   }

   public void a(hbx $$0) {
      this.E.add($$0);
   }

   private float g(hca $$0) {
      return azk.a($$0.g(), 0.5F, 2.0F);
   }

   private float h(hca $$0) {
      return this.a($$0.f(), $$0.c());
   }

   private float a(float $$0, awm $$1) {
      return azk.a($$0 * this.a($$1), 0.0F, 1.0F);
   }

   public void e() {
      if (this.o) {
         this.t.a($$0 -> $$0.forEach(fbs::d));
      }
   }

   public void f() {
      if (this.o) {
         this.t.a($$0 -> $$0.forEach(fbs::e));
      }
   }

   public void a(hca $$0, int $$1) {
      this.A.put($$0, this.u + $$1);
   }

   public void a(fir $$0) {
      if (this.o && $$0.h()) {
         fbv $$1 = new fbv($$0.b(), new ezn($$0.l()), new ezn($$0.m()));
         this.s.execute(() -> this.q.a($$1));
      }
   }

   public void a(@Nullable ali $$0, @Nullable awm $$1) {
      if ($$1 != null) {
         for (hca $$2 : this.y.get($$1)) {
            if ($$0 == null || $$2.a().equals($$0)) {
               this.a($$2);
            }
         }
      } else if ($$0 == null) {
         this.d();
      } else {
         for (hca $$3 : this.x.keySet()) {
            if ($$3.a().equals($$0)) {
               this.a($$3);
            }
         }
      }
   }

   public String g() {
      return this.p.f();
   }

   public List<String> h() {
      return this.p.g();
   }

   public fbv i() {
      return this.q.c();
   }

   static enum a {
      a,
      b,
      c;
   }
}
