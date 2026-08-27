import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.function.IntFunction;

public class zo implements uo<zb> {
   private static final int a = 128;
   private final int b;
   private final int c;
   private final int d;
   private final int e;
   private final cbo f;
   private final cfz g;
   private final Int2ObjectMap<cfz> h;

   public zo(int $$0, int $$1, int $$2, int $$3, cbo $$4, cfz $$5, Int2ObjectMap<cfz> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = Int2ObjectMaps.unmodifiable($$6);
   }

   public zo(sf $$0) {
      this.b = $$0.readByte();
      this.c = $$0.m();
      this.d = $$0.readShort();
      this.e = $$0.readByte();
      this.f = $$0.b(cbo.class);
      IntFunction<Int2ObjectOpenHashMap<cfz>> $$1 = sf.a(Int2ObjectOpenHashMap::new, 128);
      this.h = Int2ObjectMaps.unmodifiable($$0.a($$1, $$0x -> Integer.valueOf($$0x.readShort()), sf::r));
      this.g = $$0.r();
   }

   @Override
   public void a(sf $$0) {
      $$0.writeByte(this.b);
      $$0.d(this.c);
      $$0.writeShort(this.d);
      $$0.writeByte(this.e);
      $$0.a(this.f);
      $$0.a(this.h, sf::writeShort, sf::a);
      $$0.a(this.g);
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.b;
   }

   public int c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }

   public cfz e() {
      return this.g;
   }

   public Int2ObjectMap<cfz> f() {
      return this.h;
   }

   public cbo g() {
      return this.f;
   }

   public int h() {
      return this.c;
   }
}
