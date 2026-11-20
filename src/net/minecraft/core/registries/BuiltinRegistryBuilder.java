package net.minecraft.core.registries;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.Lifecycle;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;
import net.minecraft.core.DefaultedMappedRegistry;
import net.minecraft.core.DefaultedRegistry;
import net.minecraft.core.MappedRegistry;
import net.minecraft.core.RegistrationInfo;
import net.minecraft.core.Registry;
import net.minecraft.core.WritableRegistry;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.Bootstrap;
import net.minecraft.util.Util;
import org.slf4j.Logger;

public class BuiltinRegistryBuilder {
   private static final Logger LOGGER = LogUtils.getLogger();
   private final Map<Identifier, Supplier<?>> loaders = new LinkedHashMap<>();
   private final WritableRegistry<WritableRegistry<?>> registry;

   public BuiltinRegistryBuilder(final Identifier root) {
      this.registry = new MappedRegistry<>(ResourceKey.createRegistryKey(root), Lifecycle.stable());
   }

   public <T> Registry<T> registerSimple(final ResourceKey<? extends Registry<T>> name, final BuiltinRegistryBuilder.RegistryBootstrap<T> loader) {
      return this.internalRegister(name, new MappedRegistry<>(name, Lifecycle.stable(), false), loader);
   }

   public <T> Registry<T> registerSimpleWithIntrusiveHolders(
      final ResourceKey<? extends Registry<T>> name, final BuiltinRegistryBuilder.RegistryBootstrap<T> loader
   ) {
      return this.internalRegister(name, new MappedRegistry<>(name, Lifecycle.stable(), true), loader);
   }

   public <T> DefaultedRegistry<T> registerDefaulted(
      final ResourceKey<? extends Registry<T>> name, final String defaultKey, final BuiltinRegistryBuilder.RegistryBootstrap<T> loader
   ) {
      return this.internalRegister(name, new DefaultedMappedRegistry<>(defaultKey, name, Lifecycle.stable(), false), loader);
   }

   public <T> DefaultedRegistry<T> registerDefaultedWithIntrusiveHolders(
      final ResourceKey<? extends Registry<T>> name, final String defaultKey, final BuiltinRegistryBuilder.RegistryBootstrap<T> loader
   ) {
      return this.internalRegister(name, new DefaultedMappedRegistry<>(defaultKey, name, Lifecycle.stable(), true), loader);
   }

   private <T, R extends WritableRegistry<T>> R internalRegister(
      final ResourceKey<? extends Registry<T>> name, final R registry, final BuiltinRegistryBuilder.RegistryBootstrap<T> loader
   ) {
      Bootstrap.checkBootstrapCalled(() -> "registry " + name.identifier());
      Identifier key = name.identifier();
      this.loaders.put(key, () -> loader.run(registry));
      this.registry.register((ResourceKey<WritableRegistry<?>>)name, registry, RegistrationInfo.BUILT_IN);
      return registry;
   }

   public void bootStrap() {
      this.createContents();
      this.freeze();
      validate(this.registry);
   }

   private void createContents() {
      this.loaders.forEach((key, value) -> {
         if (value.get() == null) {
            LOGGER.error("Unable to bootstrap registry '{}'", key);
         }
      });
   }

   private void freeze() {
      this.registry.freeze();

      for (Registry<?> registry : this.registry) {
         bindBootstrappedTagsToEmpty(registry);
         registry.freeze();
      }
   }

   private static <T extends Registry<?>> void validate(final Registry<T> registry) {
      registry.forEach(r -> {
         if (r.keySet().isEmpty()) {
            Util.logAndPauseIfInIde("Registry '" + registry.getKey((T)r) + "' was empty after loading");
         }

         if (r instanceof DefaultedRegistry) {
            Identifier key = ((DefaultedRegistry)r).getDefaultKey();
            Objects.requireNonNull(r.getValue(key), "Missing default of DefaultedMappedRegistry: " + key);
         }
      });
   }

   private static void bindBootstrappedTagsToEmpty(final Registry<?> registry) {
      ((MappedRegistry)registry).bindAllTagsToEmpty();
   }

   public Registry<? extends Registry<?>> build() {
      return this.registry;
   }

   @FunctionalInterface
   public interface RegistryBootstrap<T> {
      Object run(Registry<T> registry);
   }
}
