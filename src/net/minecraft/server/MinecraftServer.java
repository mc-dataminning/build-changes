package net.minecraft.server;

import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.net.Proxy;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.KeyPair;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import javax.imageio.ImageIO;
import net.minecraft.obfuscate.DontObfuscate;
import org.slf4j.Logger;

public abstract class MinecraftServer extends bpa<alf> implements ala, ep, AutoCloseable {
   private static final Logger k = LogUtils.getLogger();
   public static final String b = "vanilla";
   private static final float l = 0.8F;
   private static final int m = 100;
   private static final long n = 20L * azh.a / 20L;
   private static final int o = 20;
   private static final long p = 10L * azh.a;
   private static final int q = 100;
   private static final long r = 5L * azh.a;
   private static final long s = 10L * azh.b;
   private static final int t = 12;
   private static final int u = 5;
   private static final int v = 6000;
   private static final int w = 100;
   private static final int x = 3;
   public static final int c = 29999984;
   public static final dcj d = new dcj("Demo World", dcc.a, false, bqd.c, false, new dcb(), dda.c);
   public static final GameProfile e = new GameProfile(ac.e, "Anonymous Player");
   protected final eqi.c f;
   protected final eql g;
   private final List<Runnable> y = Lists.newArrayList();
   private boi z = boh.a;
   private bmu A = this.z.f();
   private Consumer<bmt> B = $$0x -> this.aX();
   private Consumer<Path> C = $$0x -> {
   };
   private boolean D;
   @Nullable
   private MinecraftServer.c E;
   private boolean F;
   private final arl G;
   private final aqw H;
   @Nullable
   private ajj I;
   @Nullable
   private ajj.a J;
   private final ayo K = ayo.a();
   private final DataFixer L;
   private String M;
   private int N = -1;
   private final jq<akt> O;
   private final Map<akj<dcf>, aqm> P = Maps.newLinkedHashMap();
   private auj Q;
   private volatile boolean R = true;
   private boolean S;
   private int T;
   private int U = 6000;
   protected final Proxy h;
   private boolean V;
   private boolean W;
   private boolean X;
   private boolean Y;
   @Nullable
   private String Z;
   private int aa;
   private final long[] ab = new long[100];
   private long ac = 0L;
   @Nullable
   private KeyPair ad;
   @Nullable
   private GameProfile ae;
   private boolean af;
   private volatile boolean ag;
   private long ah;
   protected final ale i;
   private long ai;
   private final Thread aj;
   private long ak = ac.d();
   private long al = ac.d();
   private long am;
   private long an = ac.d();
   private long ao;
   private boolean ap;
   private final ath aq;
   private final alc ar = new alc(this);
   @Nullable
   private epz as;
   private final all at = new all();
   private final akz au;
   private boolean av;
   private float aw;
   private final Executor ax;
   @Nullable
   private String ay;
   private MinecraftServer.a az;
   private final emx aA;
   private final ald aB;
   protected final eqo j;
   private final cwc aC;
   private volatile boolean aD;
   private static final AtomicReference<RuntimeException> aE = new AtomicReference<>();

   public static <S extends MinecraftServer> S a(Function<Thread, S> $$0) {
      AtomicReference<S> $$1 = new AtomicReference<>();
      Thread $$2 = new Thread(() -> $$1.get().y(), "Server thread");
      $$2.setUncaughtExceptionHandler(($$0x, $$1x) -> k.error("Uncaught exception in server thread", $$1x));
      if (Runtime.getRuntime().availableProcessors() > 4) {
         $$2.setPriority(8);
      }

      S $$3 = (S)$$0.apply($$2);
      $$1.set($$3);
      $$2.start();
      return $$3;
   }

   public MinecraftServer(Thread $$0, eqi.c $$1, ath $$2, alh $$3, Proxy $$4, DataFixer $$5, ale $$6, aqw $$7) {
      super("Server");
      this.O = $$3.c();
      this.j = $$3.d();
      if (!this.O.a().d(lr.ba).d(dwg.b)) {
         throw new IllegalStateException("Missing Overworld dimension data");
      } else {
         this.h = $$4;
         this.aq = $$2;
         this.az = new MinecraftServer.a($$3.a(), $$3.b());
         this.i = $$6;
         if ($$6.f() != null) {
            $$6.f().a(this);
         }

         this.G = new arl(this);
         this.aB = new ald(this);
         this.H = $$7;
         this.f = $$1;
         this.g = $$1.g();
         this.L = $$5;
         this.au = new akz(this, this.az.b.a());
         jk<dfh> $$8 = this.O.a().d(lr.f).q().a(this.j.K());
         this.aA = new emx($$3.a(), $$1, $$5, $$8);
         this.aj = $$0;
         this.ax = ac.g();
         this.aC = cwc.a(this.j.K());
      }
   }

   private void a(eqc $$0) {
      $$0.a(this.aL().b(), "scoreboard");
   }

   protected abstract boolean e() throws IOException;

   protected void t_() {
      if (!bna.f.c()) {
      }

      boolean $$0 = false;
      bnd $$1 = bna.f.e();
      this.j.a(this.getServerModName(), this.Q().a());
      aqv $$2 = this.H.create(this.j.o().c(dcb.Z));
      this.a($$2);
      this.t();
      this.b($$2);
      if ($$1 != null) {
         $$1.finish();
      }

      if ($$0) {
         try {
            bna.f.b();
         } catch (Throwable var5) {
            k.warn("Failed to stop JFR profiling", var5);
         }
      }
   }

   protected void t() {
   }

   protected void a(aqv $$0) {
      eqn $$1 = this.j.I();
      boolean $$2 = this.j.A();
      jw<dwg> $$3 = this.O.a().d(lr.ba);
      dzd $$4 = this.j.y();
      long $$5 = $$4.b();
      long $$6 = ddh.a($$5);
      List<dbs> $$7 = ImmutableList.of(new dyr(), new dyq(), new clt(), new ced(), new cme($$1));
      dwg $$8 = $$3.a(dwg.b);
      aqm $$9 = new aqm(this, this.ax, this.f, $$1, dcf.h, $$8, $$0, $$2, $$6, $$7, true, null);
      this.P.put(dcf.h, $$9);
      eqc $$10 = $$9.u();
      this.a($$10);
      this.as = new epz($$10);
      dub $$11 = $$9.C_();
      if (!$$1.n()) {
         try {
            a($$9, $$1, $$4.d(), $$2);
            $$1.c(true);
            if ($$2) {
               this.a(this.j);
            }
         } catch (Throwable var23) {
            o $$13 = o.a(var23, "Exception initializing level");

            try {
               $$9.a($$13);
            } catch (Throwable var22) {
            }

            throw new y($$13);
         }

         $$1.c(true);
      }

      this.ai().a($$9);
      if (this.j.E() != null) {
         this.aO().a(this.j.E(), this.bd());
      }

      bqn $$14 = $$9.L();

      for (Entry<akj<dwg>, dwg> $$15 : $$3.h()) {
         akj<dwg> $$16 = $$15.getKey();
         if ($$16 != dwg.b) {
            akj<dcf> $$17 = akj.a(lr.aZ, $$16.a());
            eqb $$18 = new eqb(this.j, $$1);
            aqm $$19 = new aqm(this, this.ax, this.f, $$18, $$17, $$15.getValue(), $$0, $$2, $$6, ImmutableList.of(), false, $$14);
            $$11.a(new dtz.a($$19.C_()));
            this.P.put($$17, $$19);
         }
      }

      $$11.a($$1.p());
   }

   private static void a(aqm $$0, eqn $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         $$1.a(ja.c.b(80), 0.0F);
      } else {
         aqk $$4 = $$0.l();
         dbm $$5 = new dbm($$4.i().b().a());
         int $$6 = $$4.g().a($$0);
         if ($$6 < $$0.I_()) {
            ja $$7 = $$5.l();
            $$6 = $$0.a(dyf.a.b, $$7.u() + 8, $$7.w() + 8);
         }

         $$1.a($$5.l().b(8, $$6, 8), 0.0F);
         int $$8 = 0;
         int $$9 = 0;
         int $$10 = 0;
         int $$11 = -1;

         for (int $$12 = 0; $$12 < ayg.h(11); $$12++) {
            if ($$8 >= -5 && $$8 <= 5 && $$9 >= -5 && $$9 <= 5) {
               ja $$13 = aqh.a($$0, new dbm($$5.e + $$8, $$5.f + $$9));
               if ($$13 != null) {
                  $$1.a($$13, 0.0F);
                  break;
               }
            }

            if ($$8 == $$9 || $$8 < 0 && $$8 == -$$9 || $$8 > 0 && $$8 == 1 - $$9) {
               int $$14 = $$10;
               $$10 = -$$11;
               $$11 = $$14;
            }

            $$8 += $$10;
            $$9 += $$11;
         }

         if ($$2) {
            $$0.H_().c(lr.aH).flatMap($$0x -> $$0x.b(ro.m)).ifPresent($$3x -> ((eax)$$3x.a()).a($$0, $$4.g(), $$0.z, $$1.a()));
         }
      }
   }

   private void a(eqo $$0) {
      $$0.a(bqd.a);
      $$0.d(true);
      eqn $$1 = $$0.I();
      $$1.b(false);
      $$1.a(false);
      $$1.a(1000000000);
      $$1.b(6000L);
      $$1.a(dcc.d);
   }

   private void b(aqv $$0) {
      aqm $$1 = this.J();
      k.info("Preparing start region for dimension {}", $$1.af().a());
      ja $$2 = $$1.V();
      $$0.a(new dbm($$2));
      aqk $$3 = $$1.l();
      this.an = ac.d();
      $$1.a($$2, $$1.W());
      int $$4 = this.aN().c(dcb.Z);
      int $$5 = $$4 > 0 ? ayg.h(aqv.a($$4)) : 0;

      while ($$3.b() < $$5) {
         this.an = ac.d() + s;
         this.v_();
      }

      this.an = ac.d() + s;
      this.v_();

      for (aqm $$6 : this.P.values()) {
         dca $$7 = $$6.u().b(dca.a(), "chunks");
         if ($$7 != null) {
            LongIterator $$8 = $$7.b().iterator();

            while ($$8.hasNext()) {
               long $$9 = $$8.nextLong();
               dbm $$10 = new dbm($$9);
               $$6.l().a($$10, true);
            }
         }
      }

      this.an = ac.d() + s;
      this.v_();
      $$0.b();
      this.bH();
   }

   public dcc u_() {
      return this.j.k();
   }

   public boolean j() {
      return this.j.l();
   }

   public abstract int k();

   public abstract int l();

   public abstract boolean m();

   public boolean a(boolean $$0, boolean $$1, boolean $$2) {
      boolean $$3 = false;

      for (aqm $$4 : this.L()) {
         if (!$$0) {
            k.info("Saving chunks for level '{}'/{}", $$4, $$4.af().a());
         }

         $$4.a(null, $$1, $$4.e && !$$2);
         $$3 = true;
      }

      aqm $$5 = this.J();
      eqn $$6 = this.j.I();
      $$6.a($$5.C_().t());
      this.j.a(this.aO().a(this.bd()));
      this.f.a(this.bd(), this.j, this.ai().r());
      if ($$1) {
         for (aqm $$7 : this.L()) {
            k.info("ThreadedAnvilChunkStorage ({}): All chunks are saved", $$7.l().a.n());
         }

         k.info("ThreadedAnvilChunkStorage: All dimensions are saved");
      }

      return $$3;
   }

   public boolean b(boolean $$0, boolean $$1, boolean $$2) {
      boolean var4;
      try {
         this.aD = true;
         this.ai().h();
         var4 = this.a($$0, $$1, $$2);
      } finally {
         this.aD = false;
      }

      return var4;
   }

   @Override
   public void close() {
      this.v();
   }

   public void v() {
      if (this.z.e()) {
         this.aZ();
      }

      k.info("Stopping server");
      this.aj().b();
      this.aD = true;
      if (this.Q != null) {
         k.info("Saving players");
         this.Q.h();
         this.Q.s();
      }

      k.info("Saving worlds");

      for (aqm $$0 : this.L()) {
         if ($$0 != null) {
            $$0.e = false;
         }
      }

      while (this.P.values().stream().anyMatch($$0x -> $$0x.l().a.e())) {
         this.an = ac.d() + azh.b;

         for (aqm $$1 : this.L()) {
            $$1.l().o();
            $$1.l().a(() -> true, false);
         }

         this.v_();
      }

      this.a(false, true, false);

      for (aqm $$2 : this.L()) {
         if ($$2 != null) {
            try {
               $$2.close();
            } catch (IOException var5) {
               k.error("Exception closing the level", var5);
            }
         }
      }

      this.aD = false;
      this.az.close();

      try {
         this.f.close();
      } catch (IOException var4) {
         k.error("Failed to unlock level {}", this.f.f(), var4);
      }
   }

   public String w() {
      return this.M;
   }

   public void a_(String $$0) {
      this.M = $$0;
   }

   public boolean x() {
      return this.R;
   }

   public void a(boolean $$0) {
      this.R = false;
      if ($$0) {
         try {
            this.aj.join();
         } catch (InterruptedException var3) {
            k.error("Error while shutting down", var3);
         }
      }
   }

   protected void y() {
      try {
         if (!this.e()) {
            throw new IllegalStateException("Failed to initialize server");
         }

         this.an = ac.d();
         this.J = this.bD().orElse(null);
         this.I = this.bF();

         while (this.R) {
            long $$0;
            if (!this.E() && this.aB.a() && this.aB.d()) {
               $$0 = 0L;
               this.an = ac.d();
               this.ah = this.an;
            } else {
               $$0 = this.aB.h();
               long $$2 = ac.d() - this.an;
               if ($$2 > n + 20L * $$0 && this.an - this.ah >= p + 100L * $$0) {
                  long $$3 = $$2 / $$0;
                  k.warn("Can't keep up! Is the server overloaded? Running {}ms or {} ticks behind", $$2 / azh.b, $$3);
                  this.an += $$3 * $$0;
                  this.ah = this.an;
               }
            }

            boolean $$4 = $$0 == 0L;
            if (this.F) {
               this.F = false;
               this.E = new MinecraftServer.c(ac.d(), this.T);
            }

            this.an += $$0;
            this.bI();
            this.A.a("tick");
            this.a($$4 ? () -> false : this::bu);
            this.A.b("nextTickWait");
            this.ap = true;
            this.ao = Math.max(ac.d() + $$0, this.an);
            this.bs();
            this.v_();
            this.bt();
            if ($$4) {
               this.aB.e();
            }

            this.A.c();
            this.br();
            this.aV();
            this.ag = true;
            bna.f.a(this.aw);
         }
      } catch (Throwable var46) {
         k.error("Encountered an unexpected exception", var46);
         o $$7 = a(var46);
         this.b($$7.g());
         File $$8 = new File(new File(this.D(), "crash-reports"), "crash-" + ac.f() + "-server.txt");
         if ($$7.a($$8)) {
            k.error("This crash report has been saved to: {}", $$8.getAbsolutePath());
         } else {
            k.error("We were unable to save this crash report to disk.");
         }

         this.a($$7);
      } finally {
         try {
            this.S = true;
            this.v();
         } catch (Throwable var44) {
            k.error("Exception stopping the server", var44);
         } finally {
            if (this.i.f() != null) {
               this.i.f().a();
            }

            this.i();
         }
      }
   }

   private void br() {
      long $$0 = ac.d();
      if (this.g()) {
         this.f().a($$0 - this.ak);
      }

      this.ak = $$0;
   }

   private void bs() {
      if (this.g()) {
         this.al = ac.d();
         this.am = 0L;
      }
   }

   private void bt() {
      if (this.g()) {
         blj $$0 = this.f();
         $$0.a(ac.d() - this.al - this.am, bll.c.ordinal());
         $$0.a(this.am, bll.d.ordinal());
      }
   }

   private static o a(Throwable $$0) {
      y $$1 = null;

      for (Throwable $$2 = $$0; $$2 != null; $$2 = $$2.getCause()) {
         if ($$2 instanceof y $$3) {
            $$1 = $$3;
         }
      }

      o $$4;
      if ($$1 != null) {
         $$4 = $$1.a();
         if ($$1 != $$0) {
            $$4.a("Wrapped in").a("Wrapping exception", $$0);
         }
      } else {
         $$4 = new o("Exception in server tick loop", $$0);
      }

      return $$4;
   }

   private boolean bu() {
      return this.bC() || ac.d() < (this.ap ? this.ao : this.an);
   }

   public static boolean z() {
      RuntimeException $$0 = aE.get();
      if ($$0 != null) {
         throw $$0;
      } else {
         return true;
      }
   }

   public static void a(RuntimeException $$0) {
      aE.compareAndSet(null, $$0);
   }

   @Override
   public void b(BooleanSupplier $$0) {
      super.b(() -> z() && $$0.getAsBoolean());
   }

   protected void v_() {
      this.bB();
      this.b((BooleanSupplier)(() -> !this.bu()));
   }

   @Override
   public void A() {
      boolean $$0 = this.g();
      long $$1 = $$0 ? ac.d() : 0L;
      super.A();
      if ($$0) {
         this.am = this.am + (ac.d() - $$1);
      }
   }

   protected alf a(Runnable $$0) {
      return new alf(this.T, $$0);
   }

   protected boolean a(alf $$0) {
      return $$0.a() + 3 < this.T || this.bu();
   }

   @Override
   public boolean B() {
      boolean $$0 = this.bv();
      this.ap = $$0;
      return $$0;
   }

   private boolean bv() {
      if (super.B()) {
         return true;
      } else {
         if (this.aB.a() || this.bu()) {
            for (aqm $$0 : this.L()) {
               if ($$0.l().d()) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   protected void b(alf $$0) {
      this.aU().d("runTask");
      super.d($$0);
   }

   private Optional<ajj.a> bD() {
      Optional<Path> $$0 = Optional.of(this.c("server-icon.png").toPath())
         .filter($$0x -> Files.isRegularFile($$0x))
         .or(() -> this.f.j().filter($$0x -> Files.isRegularFile($$0x)));
      return $$0.flatMap($$0x -> {
         try {
            BufferedImage $$1 = ImageIO.read($$0x.toFile());
            Preconditions.checkState($$1.getWidth() == 64, "Must be 64 pixels wide");
            Preconditions.checkState($$1.getHeight() == 64, "Must be 64 pixels high");
            ByteArrayOutputStream $$2 = new ByteArrayOutputStream();
            ImageIO.write($$1, "PNG", $$2);
            return Optional.of(new ajj.a($$2.toByteArray()));
         } catch (Exception var3) {
            k.error("Couldn't load server icon", var3);
            return Optional.empty();
         }
      });
   }

   public Optional<Path> C() {
      return this.f.j();
   }

   public File D() {
      return new File(".");
   }

   public void a(o $$0) {
   }

   public void i() {
   }

   public boolean E() {
      return false;
   }

   public void a(BooleanSupplier $$0) {
      long $$1 = ac.d();
      this.T++;
      this.aB.m();
      this.c($$0);
      if ($$1 - this.ai >= r) {
         this.ai = $$1;
         this.I = this.bF();
      }

      this.U--;
      if (this.U <= 0) {
         this.U = this.bE();
         k.debug("Autosave started");
         this.A.a("save");
         this.b(true, false, false);
         this.A.c();
         k.debug("Autosave finished");
      }

      this.A.a("tallying");
      long $$2 = ac.d() - $$1;
      int $$3 = this.T % 100;
      this.ac = this.ac - this.ab[$$3];
      this.ac += $$2;
      this.ab[$$3] = $$2;
      this.aw = this.aw * 0.8F + (float)$$2 / (float)azh.b * 0.19999999F;
      this.a($$1);
      this.A.c();
   }

   private void a(long $$0) {
      if (this.g()) {
         this.f().a(ac.d() - $$0, bll.b.ordinal());
      }
   }

   private int bE() {
      float $$1;
      if (this.aB.a()) {
         long $$0 = this.aS() + 1L;
         $$1 = (float)azh.a / (float)$$0;
      } else {
         $$1 = this.aB.f();
      }

      int $$3 = 300;
      return Math.max(100, (int)($$1 * 300.0F));
   }

   public void F() {
      int $$0 = this.bE();
      if ($$0 < this.U) {
         this.U = $$0;
      }
   }

   protected abstract blj f();

   public abstract boolean g();

   private ajj bF() {
      ajj.b $$0 = this.bG();
      return new ajj(wu.a(this.Z), Optional.of($$0), Optional.of(ajj.c.a()), Optional.ofNullable(this.J), this.aC());
   }

   private ajj.b bG() {
      List<aqn> $$0 = this.Q.t();
      int $$1 = this.O();
      if (this.ap()) {
         return new ajj.b($$1, $$0.size(), List.of());
      } else {
         int $$2 = Math.min($$0.size(), 12);
         ObjectArrayList<GameProfile> $$3 = new ObjectArrayList($$2);
         int $$4 = ayg.a(this.K, 0, $$0.size() - $$2);

         for (int $$5 = 0; $$5 < $$2; $$5++) {
            aqn $$6 = $$0.get($$4 + $$5);
            $$3.add($$6.Z() ? $$6.fY() : e);
         }

         ac.c($$3, this.K);
         return new ajj.b($$1, $$0.size(), $$3);
      }
   }

   public void c(BooleanSupplier $$0) {
      this.ai().t().forEach($$0x -> $$0x.c.f());
      this.A.a("commandFunctions");
      this.aG().b();
      this.A.b("levels");

      for (aqm $$1 : this.L()) {
         this.A.a(() -> $$1 + " " + $$1.af().a());
         if (this.T % 20 == 0) {
            this.A.a("timeSync");
            this.b($$1);
            this.A.c();
         }

         this.A.a("tick");

         try {
            $$1.a($$0);
         } catch (Throwable var6) {
            o $$3 = o.a(var6, "Exception ticking world");
            $$1.a($$3);
            throw new y($$3);
         }

         this.A.c();
         this.A.c();
      }

      this.A.b("connection");
      this.aj().c();
      this.A.b("players");
      this.Q.d();
      if (aa.aW && this.aB.i()) {
         sz.a.b();
      }

      this.A.b("server gui refresh");

      for (int $$4 = 0; $$4 < this.y.size(); $$4++) {
         this.y.get($$4).run();
      }

      this.A.b("send chunks");

      for (aqn $$5 : this.Q.t()) {
         $$5.c.g.a($$5);
         $$5.c.g();
      }

      this.A.c();
   }

   private void b(aqm $$0) {
      this.Q.a(new afe($$0.Z(), $$0.aa(), $$0.ab().b(dcb.l)), $$0.af());
   }

   public void G() {
      this.A.a("timeSync");

      for (aqm $$0 : this.L()) {
         this.b($$0);
      }

      this.A.c();
   }

   public boolean H() {
      return true;
   }

   public void b(Runnable $$0) {
      this.y.add($$0);
   }

   protected void b(String $$0) {
      this.ay = $$0;
   }

   public boolean I() {
      return !this.aj.isAlive();
   }

   public File c(String $$0) {
      return new File(this.D(), $$0);
   }

   public final aqm J() {
      return this.P.get(dcf.h);
   }

   @Nullable
   public aqm a(akj<dcf> $$0) {
      return this.P.get($$0);
   }

   public Set<akj<dcf>> K() {
      return this.P.keySet();
   }

   public Iterable<aqm> L() {
      return this.P.values();
   }

   @Override
   public String M() {
      return aa.b().c();
   }

   @Override
   public int N() {
      return this.Q.m();
   }

   @Override
   public int O() {
      return this.Q.n();
   }

   public String[] P() {
      return this.Q.e();
   }

   @DontObfuscate
   public String getServerModName() {
      return "vanilla";
   }

   public ab b(ab $$0) {
      $$0.a("Server Running", () -> Boolean.toString(this.R));
      if (this.Q != null) {
         $$0.a("Player Count", () -> this.Q.m() + " / " + this.Q.n() + "; " + this.Q.t());
      }

      $$0.a("Active Data Packs", () -> ath.a(this.aq.f()));
      $$0.a("Available Data Packs", () -> ath.a(this.aq.c()));
      $$0.a("Enabled Feature Flags", () -> cpa.d.b(this.j.K()).stream().map(akk::toString).collect(Collectors.joining(", ")));
      $$0.a("World Generation", () -> this.j.B().toString());
      $$0.a("World Seed", () -> String.valueOf(this.j.y().b()));
      if (this.ay != null) {
         $$0.a("Server Id", () -> this.ay);
      }

      return this.a($$0);
   }

   public abstract ab a(ab var1);

   public ayf Q() {
      return ayf.a("vanilla", this::getServerModName, "Server", MinecraftServer.class);
   }

   @Override
   public void a(wu $$0) {
      k.info($$0.getString());
   }

   public KeyPair R() {
      return this.ad;
   }

   public int S() {
      return this.N;
   }

   public void a(int $$0) {
      this.N = $$0;
   }

   @Nullable
   public GameProfile T() {
      return this.ae;
   }

   public void b(@Nullable GameProfile $$0) {
      this.ae = $$0;
   }

   public boolean U() {
      return this.ae != null;
   }

   protected void V() {
      k.info("Generating keypair");

      try {
         this.ad = axd.b();
      } catch (axe var2) {
         throw new IllegalStateException("Failed to generate key pair", var2);
      }
   }

   public void a(bqd $$0, boolean $$1) {
      if ($$1 || !this.j.r()) {
         this.j.a(this.j.l() ? bqd.d : $$0);
         this.bH();
         this.ai().t().forEach(this::c);
      }
   }

   public int b(int $$0) {
      return $$0;
   }

   private void bH() {
      for (aqm $$0 : this.L()) {
         $$0.b(this.W(), this.ac());
      }
   }

   public void b(boolean $$0) {
      this.j.d($$0);
      this.ai().t().forEach(this::c);
   }

   private void c(aqn $$0) {
      eqe $$1 = $$0.dQ().A_();
      $$0.c.b(new aca($$1.q(), $$1.r()));
   }

   public boolean W() {
      return this.j.q() != bqd.a;
   }

   public boolean X() {
      return this.af;
   }

   public void c(boolean $$0) {
      this.af = $$0;
   }

   public Optional<MinecraftServer.b> Y() {
      return Optional.empty();
   }

   public boolean Z() {
      return this.Y().filter(MinecraftServer.b::d).isPresent();
   }

   public abstract boolean n();

   public abstract int o();

   public boolean aa() {
      return this.V;
   }

   public void d(boolean $$0) {
      this.V = $$0;
   }

   public boolean ab() {
      return this.W;
   }

   public void e(boolean $$0) {
      this.W = $$0;
   }

   public boolean ac() {
      return true;
   }

   public boolean ad() {
      return true;
   }

   public abstract boolean p();

   public boolean ae() {
      return this.X;
   }

   public void f(boolean $$0) {
      this.X = $$0;
   }

   public boolean af() {
      return this.Y;
   }

   public void g(boolean $$0) {
      this.Y = $$0;
   }

   public abstract boolean q();

   @Override
   public String ag() {
      return this.Z;
   }

   public void d(String $$0) {
      this.Z = $$0;
   }

   public boolean ah() {
      return this.S;
   }

   public auj ai() {
      return this.Q;
   }

   public void a(auj $$0) {
      this.Q = $$0;
   }

   public abstract boolean r();

   public void a(dcc $$0) {
      this.j.a($$0);
   }

   public arl aj() {
      return this.G;
   }

   public boolean ak() {
      return this.ag;
   }

   public boolean al() {
      return false;
   }

   public boolean a(@Nullable dcc $$0, boolean $$1, int $$2) {
      return false;
   }

   public int am() {
      return this.T;
   }

   public int an() {
      return 16;
   }

   public boolean a(aqm $$0, ja $$1, cmk $$2) {
      return false;
   }

   public boolean ao() {
      return true;
   }

   public boolean ap() {
      return false;
   }

   public Proxy aq() {
      return this.h;
   }

   public int ar() {
      return this.aa;
   }

   public void c(int $$0) {
      this.aa = $$0;
   }

   public MinecraftSessionService as() {
      return this.i.c();
   }

   @Nullable
   public ayt at() {
      return this.i.a();
   }

   public GameProfileRepository au() {
      return this.i.e();
   }

   @Nullable
   public auf av() {
      return this.i.f();
   }

   @Nullable
   public ajj aw() {
      return this.I;
   }

   public void ax() {
      this.ai = 0L;
   }

   public int ay() {
      return 29999984;
   }

   @Override
   public boolean az() {
      return super.az() && !this.ah();
   }

   @Override
   public void c(Runnable $$0) {
      if (this.ah()) {
         throw new RejectedExecutionException("Server already shutting down");
      } else {
         super.c($$0);
      }
   }

   @Override
   public Thread aA() {
      return this.aj;
   }

   public int aB() {
      return 256;
   }

   public boolean aC() {
      return false;
   }

   public long aD() {
      return this.an;
   }

   public DataFixer aE() {
      return this.L;
   }

   public int a(@Nullable aqm $$0) {
      return $$0 != null ? $$0.ab().c(dcb.s) : 10;
   }

   public akx aF() {
      return this.az.b.e();
   }

   public akz aG() {
      return this.au;
   }

   public CompletableFuture<Void> a(Collection<String> $$0) {
      CompletableFuture<Void> $$1 = CompletableFuture.<ImmutableList>supplyAsync(
            () -> $$0.stream().map(this.aq::c).filter(Objects::nonNull).map(ate::f).collect(ImmutableList.toImmutableList()), this
         )
         .thenCompose($$0x -> {
            atm $$1x = new atp(ask.b, $$0x);
            return akv.a($$1x, this.O, this.j.K(), this.n() ? er.a.b : er.a.c, this.l(), this.ax, this).whenComplete(($$1xx, $$2) -> {
               if ($$2 != null) {
                  $$1x.close();
               }
            }).thenApply($$1xx -> new MinecraftServer.a($$1x, $$1xx));
         })
         .thenAcceptAsync($$1x -> {
            this.az.close();
            this.az = $$1x;
            this.aq.b($$0);
            dda $$2 = new dda(a(this.aq, true), this.j.K());
            this.j.a($$2);
            this.az.b.g();
            this.ai().h();
            this.ai().u();
            this.au.a(this.az.b.a());
            this.aA.a(this.az.a);
         }, this);
      if (this.bx()) {
         this.b($$1::isDone);
      }

      return $$1;
   }

   public static dda a(ath $$0, dda $$1, boolean $$2, boolean $$3) {
      dbt $$4 = $$1.a();
      coy $$5 = $$2 ? coy.a() : $$1.b();
      coy $$6 = $$2 ? cpa.d.a() : $$1.b();
      $$0.a();
      if ($$3) {
         return a($$0, List.of("vanilla"), $$5, false);
      } else {
         Set<String> $$7 = Sets.newLinkedHashSet();

         for (String $$8 : $$4.a()) {
            if ($$0.d($$8)) {
               $$7.add($$8);
            } else {
               k.warn("Missing data pack {}", $$8);
            }
         }

         for (ate $$9 : $$0.c()) {
            String $$10 = $$9.g();
            if (!$$4.b().contains($$10)) {
               coy $$11 = $$9.e();
               boolean $$12 = $$7.contains($$10);
               if (!$$12 && $$9.l().a()) {
                  if ($$11.a($$6)) {
                     k.info("Found new data pack {}, loading it automatically", $$10);
                     $$7.add($$10);
                  } else {
                     k.info("Found new data pack {}, but can't load it due to missing features {}", $$10, cpa.a($$6, $$11));
                  }
               }

               if ($$12 && !$$11.a($$6)) {
                  k.warn("Pack {} requires features {} that are not enabled for this world, disabling pack.", $$10, cpa.a($$6, $$11));
                  $$7.remove($$10);
               }
            }
         }

         if ($$7.isEmpty()) {
            k.info("No datapacks selected, forcing vanilla");
            $$7.add("vanilla");
         }

         return a($$0, $$7, $$5, true);
      }
   }

   private static dda a(ath $$0, Collection<String> $$1, coy $$2, boolean $$3) {
      $$0.b($$1);
      a($$0, $$2);
      dbt $$4 = a($$0, $$3);
      coy $$5 = $$0.e().c($$2);
      return new dda($$4, $$5);
   }

   private static void a(ath $$0, coy $$1) {
      coy $$2 = $$0.e();
      coy $$3 = $$1.d($$2);
      if (!$$3.b()) {
         Set<String> $$4 = new ObjectArraySet($$0.d());

         for (ate $$5 : $$0.c()) {
            if ($$3.b()) {
               break;
            }

            if ($$5.l() == ati.d) {
               String $$6 = $$5.g();
               coy $$7 = $$5.e();
               if (!$$7.b() && $$7.b($$3) && $$7.a($$1)) {
                  if (!$$4.add($$6)) {
                     throw new IllegalStateException("Tried to force '" + $$6 + "', but it was already enabled");
                  }

                  k.info("Found feature pack ('{}') for requested feature, forcing to enabled", $$6);
                  $$3 = $$3.d($$7);
               }
            }
         }

         $$0.b($$4);
      }
   }

   private static dbt a(ath $$0, boolean $$1) {
      Collection<String> $$2 = $$0.d();
      List<String> $$3 = ImmutableList.copyOf($$2);
      List<String> $$4 = $$1 ? $$0.b().stream().filter($$1x -> !$$2.contains($$1x)).toList() : List.of();
      return new dbt($$3, $$4);
   }

   public void a(eq $$0) {
      if (this.aP()) {
         auj $$1 = $$0.l().ai();
         aur $$2 = $$1.i();

         for (aqn $$4 : Lists.newArrayList($$1.t())) {
            if (!$$2.a($$4.fY())) {
               $$4.c.b(wu.c("multiplayer.disconnect.not_whitelisted"));
            }
         }
      }
   }

   public ath aH() {
      return this.aq;
   }

   public er aI() {
      return this.az.b.d();
   }

   public eq aJ() {
      aqm $$0 = this.J();
      return new eq(this, $$0 == null ? ewf.b : ewf.a($$0.V()), ewe.a, $$0, 4, "Server", wu.b("Server"), this, null);
   }

   @Override
   public boolean l_() {
      return true;
   }

   @Override
   public boolean w_() {
      return true;
   }

   @Override
   public abstract boolean U_();

   public cym aK() {
      return this.az.b.c();
   }

   public alc aL() {
      return this.ar;
   }

   public epz aM() {
      if (this.as == null) {
         throw new NullPointerException("Called before server init");
      } else {
         return this.as;
      }
   }

   public dcb aN() {
      return this.J().ab();
   }

   public all aO() {
      return this.at;
   }

   public boolean aP() {
      return this.av;
   }

   public void h(boolean $$0) {
      this.av = $$0;
   }

   public float aQ() {
      return this.aw;
   }

   public ald aR() {
      return this.aB;
   }

   public long aS() {
      return this.ac / (long)Math.min(100, Math.max(this.T, 1));
   }

   public long[] aT() {
      return this.ab;
   }

   public int c(GameProfile $$0) {
      if (this.ai().f($$0)) {
         aul $$1 = this.ai().k().b($$0);
         if ($$1 != null) {
            return $$1.a();
         } else if (this.a($$0)) {
            return 4;
         } else if (this.U()) {
            return this.ai().v() ? 4 : 0;
         } else {
            return this.k();
         }
      } else {
         return 0;
      }
   }

   public bmu aU() {
      return this.A;
   }

   public abstract boolean a(GameProfile var1);

   public void a(Path $$0) throws IOException {
   }

   private void b(Path $$0) {
      Path $$1 = $$0.resolve("levels");

      try {
         for (Entry<akj<dcf>, aqm> $$2 : this.P.entrySet()) {
            akk $$3 = $$2.getKey().a();
            Path $$4 = $$1.resolve($$3.b()).resolve($$3.a());
            Files.createDirectories($$4);
            $$2.getValue().a($$4);
         }

         this.d($$0.resolve("gamerules.txt"));
         this.e($$0.resolve("classpath.txt"));
         this.c($$0.resolve("stats.txt"));
         this.f($$0.resolve("threads.txt"));
         this.a($$0.resolve("server.properties.txt"));
         this.g($$0.resolve("modules.txt"));
      } catch (IOException var7) {
         k.warn("Failed to save debug report", var7);
      }
   }

   private void c(Path $$0) throws IOException {
      try (Writer $$1 = Files.newBufferedWriter($$0)) {
         $$1.write(String.format(Locale.ROOT, "pending_tasks: %d\n", this.by()));
         $$1.write(String.format(Locale.ROOT, "average_tick_time: %f\n", this.aQ()));
         $$1.write(String.format(Locale.ROOT, "tick_times: %s\n", Arrays.toString(this.ab)));
         $$1.write(String.format(Locale.ROOT, "queue: %s\n", ac.g()));
      }
   }

   private void d(Path $$0) throws IOException {
      try (Writer $$1 = Files.newBufferedWriter($$0)) {
         final List<String> $$2 = Lists.newArrayList();
         final dcb $$3 = this.aN();
         dcb.a(new dcb.c() {
            @Override
            public <T extends dcb.g<T>> void a(dcb.e<T> $$0, dcb.f<T> $$1) {
               $$2.add(String.format(Locale.ROOT, "%s=%s\n", $$0.a(), $$3.a($$0)));
            }
         });

         for (String $$4 : $$2) {
            $$1.write($$4);
         }
      }
   }

   private void e(Path $$0) throws IOException {
      try (Writer $$1 = Files.newBufferedWriter($$0)) {
         String $$2 = System.getProperty("java.class.path");
         String $$3 = System.getProperty("path.separator");

         for (String $$4 : Splitter.on($$3).split($$2)) {
            $$1.write($$4);
            $$1.write("\n");
         }
      }
   }

   private void f(Path $$0) throws IOException {
      ThreadMXBean $$1 = ManagementFactory.getThreadMXBean();
      ThreadInfo[] $$2 = $$1.dumpAllThreads(true, true);
      Arrays.sort($$2, Comparator.comparing(ThreadInfo::getThreadName));

      try (Writer $$3 = Files.newBufferedWriter($$0)) {
         for (ThreadInfo $$4 : $$2) {
            $$3.write($$4.toString());
            $$3.write(10);
         }
      }
   }

   private void g(Path $$0) throws IOException {
      try (Writer $$1 = Files.newBufferedWriter($$0)) {
         List<ayh.a> $$2;
         try {
            $$2 = Lists.newArrayList(ayh.a());
         } catch (Throwable var7) {
            k.warn("Failed to list native modules", var7);
            return;
         }

         $$2.sort(Comparator.comparing($$0x -> $$0x.a));

         for (ayh.a $$5 : $$2) {
            $$1.write($$5.toString());
            $$1.write(10);
         }
      }
   }

   private void bI() {
      if (this.D) {
         this.z = bog.a(new bok(ac.c, this.n()), ac.c, ac.h(), new bom("server"), this.B, $$0 -> {
            this.h(() -> this.b($$0.resolve("server")));
            this.C.accept($$0);
         });
         this.D = false;
      }

      this.A = bmx.a(this.z.f(), bmx.a("Server"));
      this.z.c();
      this.A.a();
   }

   public void aV() {
      this.A.b();
      this.z.d();
   }

   public boolean aW() {
      return this.z.e();
   }

   public void a(Consumer<bmt> $$0, Consumer<Path> $$1) {
      this.B = $$1x -> {
         this.aX();
         $$0.accept($$1x);
      };
      this.C = $$1;
      this.D = true;
   }

   public void aX() {
      this.z = boh.a;
   }

   public void aY() {
      this.z.a();
   }

   public void aZ() {
      this.z.b();
      this.A = this.z.f();
   }

   public Path a(eqg $$0) {
      return this.f.a($$0);
   }

   public boolean ba() {
      return true;
   }

   public emx bb() {
      return this.aA;
   }

   public eqo bc() {
      return this.j;
   }

   public jx.b bd() {
      return this.O.a();
   }

   public jq<akt> be() {
      return this.O;
   }

   public aku.b bf() {
      return this.az.b.b();
   }

   public arr a(aqn $$0) {
      return arr.a;
   }

   public aqo b(aqn $$0) {
      return (aqo)(this.X() ? new aqb($$0) : new aqo($$0));
   }

   @Nullable
   public dcc bg() {
      return null;
   }

   public atw bh() {
      return this.az.a;
   }

   public boolean bi() {
      return this.aD;
   }

   public boolean bj() {
      return this.F || this.E != null;
   }

   public void bk() {
      this.F = true;
   }

   public bmt bl() {
      if (this.E == null) {
         return bmp.a;
      } else {
         bmt $$0 = this.E.a(ac.d(), this.T);
         this.E = null;
         return $$0;
      }
   }

   public int bm() {
      return 1000000;
   }

   public void a(wu $$0, wq.a $$1, @Nullable String $$2) {
      String $$3 = $$1.a($$0).getString();
      if ($$2 != null) {
         k.info("[{}] {}", $$2, $$3);
      } else {
         k.info("{}", $$3);
      }
   }

   public wp bn() {
      return wp.a;
   }

   public boolean bo() {
      return true;
   }

   public void a(aqn $$0, blh $$1) {
   }

   public boolean bp() {
      return false;
   }

   public void a(dbm $$0) {
   }

   public void b(dbm $$0) {
   }

   public cwc bq() {
      return this.aC;
   }

   static record a(atm a, akv b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.close();
      }
   }

   public static record b(UUID a, String b, String c, boolean d, @Nullable wu e) {
   }

   static class c {
      final long a;
      final int b;

      c(long $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      bmt a(final long $$0, final int $$1) {
         return new bmt() {
            @Override
            public List<bmw> a(String $$0x) {
               return Collections.emptyList();
            }

            @Override
            public boolean a(Path $$0x) {
               return false;
            }

            @Override
            public long a() {
               return c.this.a;
            }

            @Override
            public int b() {
               return c.this.b;
            }

            @Override
            public long c() {
               return $$0;
            }

            @Override
            public int d() {
               return $$1;
            }

            @Override
            public String e() {
               return "";
            }
         };
      }
   }
}
